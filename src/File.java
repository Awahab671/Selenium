 public abstract class File {

    abstract void open();

    void edit(){
        System.out.println("You can edit the file.");
    }
    public void close(){
          System.out.println("You can close the file.");
    }

      class JavaFile extends File{
        void open(){
         System.out.println("You have to download notepad++ to open a java file.");
        }
    }
     class PdfFile extends File{
      void open (){
      System.out.println("You have to download PDF reader to open a PDF file.");
     }
    }
    class wordFile extends File{
          void open (){
             System.out.println("You have to download microsoft word to open .docs files.");
         }
     }
}
