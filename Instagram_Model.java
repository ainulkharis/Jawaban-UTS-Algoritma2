package Model;

import java.util.ArrayList;

public class Instagram_Model {

    public String User;
    public String Foto;
    public String Caption;
    public int Like = 0;
    public ArrayList Comment = new ArrayList<>();

    public Instagram_Model(){

    }

    public Instagram_Model(String userPost, String fotoPost, String captionPost, int likePost, ArrayList commentPost){
        this.User = userPost;
        this.Foto = fotoPost;
        this.Caption = captionPost;
        this.Like = likePost;
        this.Comment = commentPost;
    }

    public void Postingan(){
        System.out.println();
        System.out.println(this.User);
        System.out.println("-------------------");
        System.out.println(this.Foto);
        System.out.println("-------------------");
        System.out.println(this.Caption);
        System.out.println("[1]Like: " + this.Like + "  [2]Comment: " + this.Comment.size() + "  [3]Show Comment: " + this.Comment.size());
        System.out.println("[0]Pilih Postingan Lain");
        System.out.println();
    }

    public int Likes(int like){
        Like = Like + 1;
        return Like;
    }

    public ArrayList Komentar (String Comment){
        for (int i = 0; i < 1; i++){
            Komentar(Comment);
        }
        return Komentar();
    }

    public void showComment(){
        for (int i = 0; i < Comment.size(); i++)
            System.out.println(Comment.get(i));
    }

}

