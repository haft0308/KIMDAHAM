package homework;
import java.util.Scanner;

///	13	///

public class Src11 {

	static String Encode(String _src)
	{
		char[] res = new char[_src.length()];
		
		for(int i=0; i<_src.length(); i++)
		{
			switch(_src.charAt(i))
			{
			case 'a':
				res[i] = '`';
				break;
			case 'b':
				res[i] = '~';
				break;
			case 'c':
				res[i] = '!';
				break;
			case 'd':
				res[i] = '@';
				break;
			case 'e':
				res[i] = '#';
				break;
			case 'f':
				res[i] = '$';
				break;
			case 'g':
				res[i] = '%';
				break;
			case 'h':
				res[i] = '^';
				break;
			case 'i':
				res[i] = '&';
				break;
			case 'j':
				res[i] = '*';
				break;
			case 'k':
				res[i] = '(';
				break;
			case 'l':
				res[i] = ')';
				break;
			case 'm':
				res[i] = '-';
				break;
			case 'n':
				res[i] = '_';
				break;
			case 'o':
				res[i] = '+';
				break;
			case 'p':
				res[i] = '=';
				break;
			case 'q':
				res[i] = '|';
				break;
			case 'r':
				res[i] = '[';
				break;
			case 's':
				res[i] = ']';
				break;
			case 't':
				res[i] = '{';
				break;
			case 'u':
				res[i] = '}';
				break;
			case 'v':
				res[i] = ';';
				break;
			case 'w':
				res[i] = ':';
				break;
			case 'x':
				res[i] = ',';
				break;
			case 'y':
				res[i] = '.';
				break;
			case 'z':
				res[i] = '/';
				break;
			case '1':
				res[i] = 'q';
				break;
			case '2':
				res[i] = 'w';
				break;
			case '3':
				res[i] = 'e';
				break;
			case '4':
				res[i] = 'r';
				break;
			case '5':
				res[i] = 't';
				break;
			case '6':
				res[i] = 'y';
				break;
			case '7':
				res[i] = 'u';
				break;
			case '8':
				res[i] = 'i';
				break;
			case '9':
				res[i] = 'o';
				break;
			case '0':
				res[i] = 'p';
				break;
			}
		}
		
		String resStr = new String(res);
		
		return resStr;
	}

	public static void main(String[] args) {
		
		//	input
		Scanner sc = new Scanner(System.in);
		String src = sc.next();
		
		//	encoding
		String res = Encode(src);
		
		//	output
		System.out.println(res); 

	}

}
