import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class cvs
{

  public static void main(String[] args) 
  {

	cvs obj = new cvs();
	obj.run();

  }

  public void run() 
  {

	String csvFile = "/home/divya/Desktop/PlacetimeInternshipProblem/Locationdata.csv";
	BufferedReader br = null;
	String line = "";
	String cvsSplitBy = ",";

	try {

		br = new BufferedReader(new FileReader(csvFile));
		while ((line = br.readLine()) != null) {

		        // use comma as separator
			String[] coordinates = line.split(cvsSplitBy);

			System.out.println("Longitude= " + coordinates[0] 
                                 + " , Latitude=" + coordinates[1]);

		}

	} catch (FileNotFoundException e)
	 {
		e.printStackTrace();
	} catch (IOException e) 
	{
		e.printStackTrace();
	} finally
	 {
		if (br != null) {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	System.out.println("Done");
  }

}
