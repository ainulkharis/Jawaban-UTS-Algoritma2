import Model.Instagram_Model;

import java.util.ArrayList;
import java.util.Scanner;

public class Instagram {
    public static void main(String[] args) {
        Instagram_Model[] post = new Instagram_Model[][];
        post[0] = new Instagram_Model();
        post[0].User = "Kharis";
        post[0].Foto = """
                ⠐⣄⡀⢀⢀⢰⣶⣶⣶⣶⣶⣦⣄⁣
                ⢀⠘⢿⣦⣄⢸⣿⣿⡟⠛⣿⣿⣿⡆⁣
                ⢀⣴⣾⣿⡿⢠⣌⡛⠇⢰⣿⣿⡿⠃⁣
                ⢀⣿⣿⣿⣄⣸⣿⣿⡆⠘⢿⣿⡄⁣
                ⢀⠙⠿⢿⣿⣿⣿⣿⡇⢀⢀⠈⠻⢆⁣""";
        post[0].Caption = """
                ANDA HEBAT
                #KERJAKERASKERJACERDAS""";

        System.out.println("INSTAGRAM");
        System.out.println("---------------");
        System.out.println("\nPostingan 1");
        post[0].Postingan();
        System.out.println("\nPostingan 2");
        post[1].Postingan();
        System.out.println("\nPostingan 3");
        post[2].Postingan();

        Scanner input = new Scanner(System.in);
        char pilihPost = 0;
        do {
            System.out.println("Pilih Postingan (1, 2, 3): ");
            pilihPost = input.next().charAt(0);
            switch (pilihPost) {
                case '1' -> {
                    post[0].Postingan();
                    char pilihan = 0;
                    do {
                        System.out.println("Pilih Perintah (0-4): ");
                        pilihan = input.next().charAt(0);
                        switch (pilihan) {
                            case '1' -> {
                                post[0].Likes(1);
                                post[0].Postingan();
                            }
                            case '2' -> {
                                System.out.print("Masukkan Komentar: ");
                                Scanner input2 = new Scanner(System.in);
                                String komen = input2.nextLine();
                                post[0].showComment();
                                post[0].Postingan();
                            }
                            case '3' -> {
                                System.out.println("Daftar Komentar: ");
                                post[0].showComment();
                            }
                            default -> {
                            }
                        }
                    } while (pilihan != '0');
                }
                case '2' -> {
                    post[1].Postingan();
                    char pilihan = 0;
                    do {
                        System.out.println("Pilih Perintah (0-4): ");
                        pilihan = input.next().charAt(0);
                        switch (pilihan) {
                            case '1' -> {
                                post[1].Likes(1);
                                post[1].Postingan();
                            }
                            case '2' -> {
                                System.out.print("Masukkan Komentar: ");
                                Scanner input2 = new Scanner(System.in);
                                String komen = input2.nextLine();
                                post[1].showComment();
                                post[1].Postingan();
                            }
                            case '3' -> {
                                System.out.println("Daftar Komentar: ");
                                post[1].showComment();
                            }
                            default -> {
                            }
                        }
                    } while (pilihan != '0');
                }
                case '3' -> {
                    post[2].Postingan();
                    char pilihan = 0;
                    do {
                        System.out.println("Pilih Perintah (0-4): ");
                        pilihan = input.next().charAt(0);
                        switch (pilihan) {
                            case '1' -> {
                                post[2].Likes(1);
                                post[2].Postingan();
                            }
                            case '2' -> {
                                System.out.print("Masukkan Komentar: ");
                                Scanner input2 = new Scanner(System.in);
                                String komen = input2.nextLine();
                                post[2].showComment();
                                post[2].Postingan();
                            }
                            case '3' -> {
                                System.out.println("Daftar Komentar: ");
                                post[2].showComment();
                            }
                            default -> {
                            }
                        }
                    } while (pilihan != '0');
                }
            }
        } while (pilihPost != '0');
    }
}

