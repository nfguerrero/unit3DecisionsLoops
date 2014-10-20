import java.util.Scanner;

public class Spectrum
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Wavelength: ");
        double wavelength = scan.nextDouble();
        
        if (wavelength < 10e-11)
        {
            System.out.print("Type: Gamma rays\nFrequency: > 3x10e19");
        }
        else if (wavelength < 10e-8)
        {
            System.out.print("Type: X-rays\nFrequency: 3x10e16 to 3x10e19");
        }
        else if (wavelength < 4*10e-7)
        {
            System.out.print("Type: Gamma rays\nFrequency: 7.5x10e14 to 3x10e16");
        }
        else if (wavelength < 7*10e-7)
        {
            System.out.print("Type: Gamma rays\nFrequency: 4x10e14 to 7.5x10e14");
        }
        else if (wavelength < 10e-3)
        {
            System.out.print("Type: Gamma rays\nFrequency: 3x10e11 to 4x10e14");
        }
        else if (wavelength < 10e-1)
        {
            System.out.print("Type: Gamma rays\nFrequency: 3x10e9 to 3x10e11");
        }
        else
        {
            System.out.print("Type: Radio Waves\nFrequency: < 3x10e9");
        }
    }
}