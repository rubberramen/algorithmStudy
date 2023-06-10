package bookAlgorithm.ch04StackQueue;

public class IntQueue {

    private int[] que;
    private int capacity;
    private int front;
    private int rear;
    private int num;

    //--- 실행시 예외: 큐가 비어있음 ---//
    public class EmptyIntQueueException extends RuntimeException {
        public EmptyIntQueueException() { }
    }

    //--- 실행시 예외: 큐가 가득 찼음 ---//
    public class OverflowIntQueueException extends RuntimeException {
        public OverflowIntQueueException() { }
    }

    public IntQueue(int maxlen) {
        num = front = rear = 0;
        capacity = maxlen;
        try {
            que = new int[capacity];
        } catch (OutOfMemoryError error) {
            capacity = 0;
        }
    }

    public int inque(int x) throws OverflowIntQueueException {
        if (num >= capacity) {
            throw new OverflowIntQueueException();
        }

        que[rear++] = x;
        num++;

        if (rear == capacity) {
            rear = 0;
        }
        return x;
    }

    public int deque() throws EmptyIntQueueException {
        if (num <= 0) {
            throw new EmptyIntQueueException();
        }

        int x = que[front++];
        num--;

        if (front == capacity) {
            front = 0;
        }
        return x;
    }

    //--- 큐에서 데이터를 피크(프런트 데이터를 들여다봄) ---//
    public int peek() throws EmptyIntQueueException {
        if (num <= 0)
            throw new EmptyIntQueueException();            // 큐가 비어있음
        return que[front];
    }

    //--- 큐를 비움 ---//
    public void clear() {
        num = front = rear = 0;
    }

    public int indexOf(int x) {
        for (int i = 0; i < num; i++) {
            int idx = (i + front) % capacity;
            if (que[idx] == x) {
                return idx;
            }
        }
        return -1;
    }

    //--- 큐의 크기를 반환 ---//
    public int getCapacity() {
        return capacity;
    }

    //--- 큐에 쌓여 있는 데이터 개수를 반환 ---//
    public int size() {
        return num;
    }

    //--- 큐가 비어있는가? ---//
    public boolean isEmpty() {
        return num <= 0;
    }

    //--- 큐가 가득 찼는가? ---//
    public boolean isFull() {
        return num >= capacity;
    }

    //--- 큐 안의 모든 데이터를 프런트 → 리어 순으로 출력 ---//
    public void dump() {
        if (num <= 0)
            System.out.println("큐가 비어있습니다.");
        else {
            for (int i = 0; i < num; i++)
                System.out.print(que[(i + front) % capacity] + " ");
            System.out.println();
        }
    }
}
