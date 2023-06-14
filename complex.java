import java.util.*;
class complex {

	int real, image;

	public complex(int r, int i)
	{
		this.real = r;
		this.image = i;
	}

	public void show()
	{
		System.out.print(this.real + " + i" + this.image);
	}

	public static complex add(complex n1, complex n2)
	{
		complex res = new complex(0, 0);
		res.real = n1.real + n2.real;
		res.image = n1.image + n2.image;
		return res;
	}

	public static void main(String arg[])
	{
		complex c1 = new complex(4, 5);
		complex c2 = new complex(10, 5);

		System.out.print("First Complex number: ");
		c1.show();
		
		System.out.print("\nSecond Complex number: ");
		c2.show();

		complex res = add(c1, c2);

		System.out.println("\nAddition is : ");
		res.show();
	}
}
