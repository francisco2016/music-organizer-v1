import java.util.ArrayList;

/**
 * A class to hold details of audio files.
 * 
 * @author David J. Barnes and Michael Kölling
 * @version 2011.07.31
 */
public class MusicOrganizer
{
    // An ArrayList for storing the file names of music files.
    private ArrayList<String> files;

    /**
     * Create a MusicOrganizer
     */
    public MusicOrganizer()
    {
        files = new ArrayList<String>();
    }

    /**
     * Add a file to the collection.
     * @param filename The file to be added.
     */
    public void addFile(String filename)
    {
        files.add(filename);
    }

    /**
     * Return the number of files in the collection.
     * @return The number of files in the collection.
     */
    public int getNumberOfFiles()
    {
        return files.size();
    }

    /**
     * List a file from the collection.
     * @param index The index of the file to be listed.
     */
    public void listFile(int index)
    {
        if(validIndex(index)) {            //if(index >= 0 && index < files.size()){  String filename = files.get(index);
            String filename = files.get(index);
            System.out.println(filename);
        }
    }

    /**
     * Remove a file from the collection.
     * @param index The index of the file to be removed.
     */
    public void removeFile(int index)
    {  
        if(validIndex(index)){           //if(index >= 0 && index < files.size()){files.remove(index);}
            files.remove(index);
        }
    }

    /** Mt. toma un par�metro entero y comprueba que sea un �ndice v�lido para el atributo files. Si el par�metro no es v�lido debe mostrar
     * un mensaje de error por pantalla e indicar el rango v�lido
     */
    public void checkIndex(int index){
        //         int index = files.size() -1;       se puede mejorar
        //         if (valor >= 0 && valor < files.size()){}  // no pasa nada.
        //         else{System.out.println("El valor ha de ser mayor o igual a 0 y menor o igual a: " + index);}
        if(index < 0 || index >= files.size()){
        System.out.println("Indice no valido.");
        if (files.size() == 0) {
        System.out.println("Debe haber archivos para hacer la comprobacion");
        }
        else {
            System.out.println("Los indice validos son del 0 al " + (files.size()-1));      
        }
    }
    }

    /**
     * Mt. que devuelve un valor booleano en funci�n de si su par�metro entero es un �ndice v�lido o no para el atributo files
     */
    public boolean validIndex(int valorB){
        
        //return (valorB >= 0 && valorB < files.size()); con esta l�nea queda resuelto el m�todo.
        boolean indexB = false;

        if (valorB >= 0 && valorB < files.size()){
            indexB = true;
        }  
        return indexB;
    }
}

