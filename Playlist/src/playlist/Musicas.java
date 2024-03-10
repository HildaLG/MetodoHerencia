/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package playlist;

/**
 *
 * @author 20012021
 */
public class Musicas {
    //ATRIBUTOS
    String title;
    String album;
    String date;
    int time;
    
    //METODOS
    //Primera Forma
    // _ Para diferencias que la variable de arriba es diferente ala de abajo
    /*public void Musicas(String _title, String _album,String _date, int _time){
        title=_title;
        album=_album;
        date=_date;
        time=_time;
    }*/
    //Segunda Forma
    public Musicas(String title,String album, String date, int time){
        this.title=title;
        this.album=album;
        this.date=date;
        this.time=time;
    }
    public void ShowPlaylist(){
        System.out.println("The title is: "+title);
        System.out.println("The album it belongs to is: "+album);
        System.out.println("The date is: "+date);
        System.out.println("The time is: "+time);
    }
    
    
}
