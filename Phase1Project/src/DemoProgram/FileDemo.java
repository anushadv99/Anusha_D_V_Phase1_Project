package DemoProgram;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileFilter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
public class FileDemo {
	public void MainFolder()
    {
		//Scanner scanner = new Scanner( System.in );
		//System.out.println("Enter the file path: ");
		//String dirPath = scanner.nextLine(); // Takes the directory path as the user input

		File folder = new File("E:\\JECM71");
        if(folder.isDirectory())
        {
            File[] fileList = folder.listFiles();

            Arrays.sort(fileList);

            System.out.println("\nTotal number of items present in the directory: " + fileList.length );


            // Lists only files since we have applied file filter
            for(File file:fileList)
            {
                System.out.println(file.getName());
            }

            // Creating a filter to return only files.
            FileFilter fileFilter = new FileFilter()
            {
                @Override
                public boolean accept(File file) {
                    return !file.isDirectory();
                }
            };

            fileList = folder.listFiles(fileFilter);

            
            //Prints the files in file name ascending order
            for(File file:fileList)
            {
                System.out.println(file.getName());
            }

        }   
    }
	
	public void AddFile() {
		try {  
			File file = new File("E:\\JECM71//hello.txt");
			
			if (file.createNewFile()) {  
                System.out.println("New File is created!"); 
               
         
			}
			else {                   
                if(file.exists())
                {
                    System.out.println("File already exists.");	
                }
			
                else
                {
                	System.out.println("File doesnot exists.");
                }
			}}
			
         catch (IOException e) {  
            e.printStackTrace();  
        }  	  
}

   
               
                //--------------Delete the file code below-------------//
        public void deleteFile() {
        	File file = new File("E:\\JECM71//hello.txt");
        	
        	  boolean b = file.delete();
                if(b==true)
                {
                	System.out.println("File deleted !!");
                }
                else
                {
                	System.out.println("File not deleted");
                }
                //------------end of the above code--------------------//
        }
        
        public void searchFile() {
			// TODO Auto-generated method stub
			try {	
				Scanner scan= new Scanner(System.in);
				File directory = new File("E:\\JECM71\\manoj");
				System.out.println("Enter the file name which you want to search:");
				String fileName=scan.nextLine();
	            File[] files=directory.listFiles();
	            int flag=0;
	            for (File file : files) {
	                String name = file.getName();
	                //System.out.println(name);
	                if (name.equals(fileName)) {
	                       // System.out.println("The filename "+fileName+" is present in the directory");
	        				File f= new File(fileName);
	        				Scanner sc1 = new Scanner(f);
	        				while(sc1.hasNextLine()) {
	        				System.out.println(sc1.nextLine());
	        				}
	        			flag=1;	
	                }
				}
	        if(flag==0) {
	        	System.out.println("File found");
	        }

			}catch(FileNotFoundException ex) {
				System.out.println("file not found");
			}

		}
        
	

}
