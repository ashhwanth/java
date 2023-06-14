class Cpu
{
    double price;

    Cpu(double pr)
    {
        this.price=pr;
    }

    class Processor
    {
        int number_of_core;
        String manufacturer;

        Processor(int n,String m)
        {
            number_of_core = n;
            manufacturer = m ;
        }
    }

    static class RAM
    {
        int memory;
        String manufacturer;

        RAM(int mr,String manu)
        {
            memory = mr;
            manufacturer = manu;
        }
    }
}

public class Program5
{
    public static void main(String[] args)
    {
       

        Cpu dell = new Cpu(345789.13);
        Cpu.Processor intel = dell.new Processor(4, "Intel");
        Cpu.RAM crucial = new Cpu.RAM(8 , "Crucial");
        System.out.println("Price:  " + dell.price);
        System.out.println("Processor Manufacturer: " + intel.manufacturer);
        System.out.println("No. of cores:   " + intel.number_of_core);
        System.out.println("RAM Manufacturer:   " + crucial.manufacturer);
        System.out.println("Memory: " + crucial.memory); 

    }
}
