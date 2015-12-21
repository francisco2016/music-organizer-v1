
/**
 * Write a description of class Test here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Test
{

    /**
     * Mt. para añadir archivos
     */
    public void añdeArchivo(){

        MusicOrganizer yama = new MusicOrganizer();

        yama.addFile("a.mp3");
        yama.addFile("b.mp3");
        yama.addFile("c.mp3");
        yama.addFile("d.mp3");
        
        System.out.println("Probando checkIndex con -1:");
        yama.checkIndex(-1);
        yama.checkIndex(2);
        yama.checkIndex(1);
        yama.checkIndex(20);
        
        yama.validIndex(2);
        yama.listFile(0);
        yama.removeFile(1);

    }

    //     /**
    //      *  Mt para comprobar indice
    //      */
    //     public void compruebaIndice(){
    // 
    //         MusicOrganizer yama = new MusicOrganizer();
    //         yama.checkIndex(2);
    // 
    //     }
    //     /**
    //      *  Mt para borrar archivos
    //      */
    //     public void borraIndice(){
    // 
    //         MusicOrganizer yama = new MusicOrganizer();
    //         yama.removeFile(2);
    // 
    //     }
}


