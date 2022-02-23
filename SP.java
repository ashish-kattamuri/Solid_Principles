
// Before Modification

package First_pack;

interface OsSupport{

    void QuickLook();

    void DeleteFile();

}

class  OperatingSystem{

    Windows windows=new Windows();

     public String nameOfOS(){

         //windows.name();

         return null;

     };  // multiple responsibilities

     void DevicesSupported(){}; // doesn't support S

     void Cost(){};

}

class namesOfOperatingSystems{ // doesn't support O

     String nameofOS(OperatingSystem os){

       if(os.equals("Mac"))

           return "MAC Operating System";

       if(os.equals("Windows"))

            return "Windows Operating System";

        if(os.equals("Linux"))

            return "Linux Operating System";

        // If another OS then you shld add another condition

          return null;

    }

}

class Windows implements OsSupport{

    public String nameOfOS() {

        return "Windows";

    }

    @Override

    public void QuickLook() {

        // return an Exception

    }


    @Override

    public void DeleteFile() {


    }

    //

}

public class BeforeModification {

    public static void main(String[] args) {

        System.out.print("Hello iam There");

    }

}




// After SOLID Priciples Application 


package Second_pack;
interface QuickLookOsSupport{
    void QuickLook();
}
interface DeleteFileOsSupport{
    void DeleteFile();
}
interface Parameters{
    void DevicesSupported();
    int cost();
}
class  OperatingSystem {
    Parameters param;
    public  OperatingSystem(){
        this.param=param;
    }
    public  String nameofOS(){return null;}
}
class DevicesSupported implements  Parameters{
    @Override
    public void DevicesSupported() {
       //
    }
    @Override
    public int cost() {
        return 0;
    }
}
class  Cost implements  Parameters{
    @Override
    public void DevicesSupported() {
        //
    }
    @Override
    public int cost() {
        return 0;
    }
}
class Mac extends OperatingSystem implements QuickLookOsSupport,DeleteFileOsSupport{
    public  String nameofOS(){
        return "MAC Operating System";
    };
    @Override
    public void QuickLook() {
       //
    }
    @Override
    public void DeleteFile() {
      //
    }
}
class Windows extends OperatingSystem{
    public  String nameofOS(){
        return "Second_pack.Windows Operating System";
    };
}
public class After_Modification {
    public static void  MyOperatingSystem(OperatingSystem os){
        System.out.print(os.nameofOS());
    }
    public static void main(String[] args) {
        MyOperatingSystem(new Windows());
    }
}




	
	
	
