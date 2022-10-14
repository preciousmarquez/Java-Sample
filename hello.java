import java.io.*;

public class hello {



  public static void main(String[] args) throws IOException {
  BufferedReader br = new BufferedReader (new InputStreamReader(System.in));

  String name;
  double Math;
  double English;
  double Filipino;
  double Science;
  double PE;
  double Sum = 0;
  double Average = 0;

  System.out.print("Enter name: ");
  name = br.readLine();
  System.out.print("Enter grade in Math: ");
  Math = Double.parseDouble(br.readLine());
  System.out.print("Enter grade in English: ");
  English = Double.parseDouble(br.readLine());
  System.out.print("Enter grade in Filipino: ");
  Filipino = Double.parseDouble(br.readLine());
  System.out.print("Enter grade in Science: ");
  Science = Double.parseDouble(br.readLine());
  System.out.print("Enter grade in P.E: ");
  PE = Double.parseDouble(br.readLine());
  Sum = Math + English + Filipino + Science + PE;
  Average = Sum / 5;
  System.out.print(name);
  System.out.println(", ito ang katotohanan.");
  System.out.println("Ang iyong GPA ay " +Average);

  if (Average >=100){
    System.out.println("ANG GALING MO!!!");
  }
  else if (Average >= 90){
    System.out.println("Malupet ka!");
  }
  else if (Average >= 80){
    System.out.println("Pasado ka!!");
  }

  else if (Average >= 70 ){
    System.out.println("Safe lang");
  }
  else{
    System.out.println("ML pa loko");
  }

  }

}
