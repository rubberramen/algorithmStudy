package inflearn;

import java.util.ArrayList;
import java.util.Scanner;

public class PlayList {
    static Scanner sc = new Scanner(System.in);

    static ArrayList<Song> lists = new ArrayList<>();

    public static void main(String[] args) {

        System.out.println();
        System.out.println("       < 나만의 플레이 리스트 🎧 >       ");
        System.out.println();

        while (true) {
            System.out.println("* 메뉴 리스트");
            System.out.println("🎵 1. 플레이 리스트에 노래를 추가합니다.");
            System.out.println("🎵 2. 플레이 리스트 목록을 불러옵니다.");
            System.out.println("🎵 3. 플레이 리스트에 노래를 삭제합니다");
            System.out.println("🎵 4. 플레이 리스트 내의 노래를 검색합니다.");
            System.out.println("🎵 0. 플레이 리스트를 종료합니다.");
            System.out.println("======================================");

            System.out.println("* 메뉴 번호를 입력하십시오.");
            int menu = sc.nextInt();
            System.out.println("======================================");

            switch (menu) {
                case 1:
                    addList();
                    break;
                case 2:
                    showList();
                    break;
                case 3:
                    deleteList();
                    break;
                case 4:
                    searchList();
                    break;
                case 0:
                    System.out.println("안녕 ~ 다음에 또 만나용 🖐️");
                    return;
                default:
                    System.out.println("⚠️ 메뉴를 다시 선택해주십시오. ");
            }

        }

    }

    static void addList() {
        Song song = new Song();

        System.out.println("🎼 플레이 리스트에 추가할 곡명을 입력해주세요. ");
        sc.nextLine();
        String name = sc.nextLine();
        System.out.println("🎤 해당 곡의 가수 이름을 입력해주세요. ");
        String artist = sc.nextLine();
        System.out.println("🎹 해당 곡의 장르를 입력해주세요. ");
        String type = sc.nextLine();

        song.setName(name);
        song.setArtist(artist);
        song.setType(type);

        lists.add(new Song(song.getName(), song.getArtist(), song.getType()));

        System.out.println();
        System.out.println(song);

        System.out.println("❗ 플레이 리스트에 곡이 추가 되었습니다. ");
        System.out.println("======================================");
    }

    static void showList() {
        System.out.println("📑 저장된 플레이 리스트를 불러옵니다. ");
        System.out.println();

        for (Song allList : lists) {
            System.out.println(allList);
        }

        System.out.println("======================================");
    }

    static void deleteList() {

        System.out.println("🗑️ 플레이 리스트에서 삭제하고싶은 옵션을 선택해주세요. ");
        System.out.println("1. 전체 플레이 리스트 삭제");
        System.out.println("2. 플레이 리스트 내의 곡 삭제");

        int choice = sc.nextInt();
        System.out.println("======================================");

        switch (choice) {
            case 1:
                lists.clear();
                System.out.println();
                System.out.println("❗ 전체 플레이 리스트가 삭제 되었습니다. ");
                break;
            case 2:
                System.out.println("🗑️ 플레이 리스트에서 삭제하고 싶은 곡명을 입력해주세요. ");
                sc.nextLine();
                String name = sc.nextLine();
                System.out.println();
                int cnt1 = 0;

                for (Song song : lists) {
                    if (song.getName().equals(name)) {
                        lists.remove(song);
                        cnt1 ++;
                        break;
                    }
                }

                if (cnt1 > 0) {
                    System.out.println("❗ 해당 곡이 삭제 되었습니다. ");
                } else {
                    System.out.println("❗ 플레이 리스트에 해당 곡이 존재하지 않습니다. ");
                }

                break;
            default:
                System.out.println("⚠️ 메뉴를 다시 선택해주십시오. ");
                break;
        }

        System.out.println("======================================");
    }

    static void searchList() {

        System.out.println("🔎 플레이 리스트에서 검색하고 싶은 옵션을 선택해주세요. ");
        System.out.println("1. 곡명으로 검색");
        System.out.println("2. 가수명으로 검색");
        System.out.println("3. 장르로 검색");

        int choice = sc.nextInt();
        System.out.println("======================================");
        sc.nextLine();

        switch (choice) {
            case 1:
                System.out.println("🏷️ 곡명을 입력하세요.");
                String name = sc.nextLine();
                System.out.println();
                int cnt1 = 0;

                for (Song song : lists) {
                    if (song.getName().equals(name)) {
                        System.out.println(song);
                        cnt1++;
                    }
                }

                if (cnt1 == 0) {
                    System.out.println("❗ 플레이 리스트에 해당 곡이 존재하지 않습니다. ");
                }

                break;
            case 2:
                System.out.println("🏷️ 가수를 입력하세요.");
                String artist = sc.nextLine();
                System.out.println();
                int cnt2 = 0;

                for (Song song : lists) {
                    if (song.getArtist().equals(artist)) {
                        System.out.println(song);
                        cnt2++;
                    }
                }

                if (cnt2 == 0) {
                    System.out.println("❗ 플레이 리스트에 해당 곡이 존재하지 않습니다. ");
                }
                break;
            case 3:
                System.out.println("🏷️ 장르를 입력하세요.");
                String type = sc.nextLine();
                System.out.println();
                int cnt3 = 0;

                for (Song song : lists) {
                    if (song.getType().equals(type)) {
                        System.out.println(song);
                        cnt3++;
                    }
                }

                if (cnt3 == 0) {
                    System.out.println("❗ 플레이 리스트에 해당 곡이 존재하지 않습니다. ");
                }
                break;
            default:
                System.out.println("⚠️ 메뉴를 다시 선택해주십시오. ");
                break;
        }

        System.out.println("======================================");

    }
}



class Song {
    String name;
    String artist;
    String type;

    public Song(){
    }

    public Song(String name, String artist, String type){
        this.name = name;
        this.artist = artist;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String toString() {
        return "💿 " + name + " [" + artist + "]  _" + type;
    }
}