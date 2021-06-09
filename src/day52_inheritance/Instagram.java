package day52_inheritance;

public class Instagram extends MobileApp{

public void postPhoto() {
    System.out.println("Posting photo on Instagram");
 }
 @Override
public void useTheApp(int minutes){// Overriding (same name, same params)(only in sub inherited)
    //access modifier same or more visible (in this case both public, the most open)
     //Public->protected->default->private(private is not inherited, so its not gonna be overriding )
     super.useTheApp(minutes);
     System.out.println("Using  app features");
     postPhoto();
 }
    @Override
    public boolean download(){
        System.out.println("Downloading Instagram Discord "+ getVersion() +" from the store");
        return true;
    }
}
