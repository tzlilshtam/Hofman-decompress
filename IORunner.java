package read_write_tofiles;
import java.io.*;
import assign1.HuffmanEncoderDecoder;
import assign1.HuffmanBetterEnDe;;

public class IORunner
{
	static String IN_FILE_PATH_1 = "C:\\Romeo and Juliet  Entire Play.txt";
	static String OUT_FILE_PATH_1 = "C:\\compress Romeo and Juliet  Entire Play.txt";
	static String IN_FILE_PATH_2 = "C:\\Red_Flowers.bmp";
	static String OUT_FILE_PATH_2 = "C:\\compress Red_Flowers.bmp";
	static String IN_FILE_PATH_3 = "C:\\Smiley.bmp";
	static String OUT_FILE_PATH_3 = "C:\\Better compress Smiley.bmp";
	
	public static void main(String[] args)
	{
		String[] input_names=new String[1];
		String[] output_names=new String[1];

		input_names[0]=IN_FILE_PATH_1;
		output_names[0]=OUT_FILE_PATH_1;
		
		
		HuffmanEncoderDecoder ob=new HuffmanEncoderDecoder();
		//ãçéñä ùì ÷åáõ èñè
		ob.Compress(input_names, output_names);

		input_names[0] = OUT_FILE_PATH_1;
		output_names[0]= "C:\\Decompress Romeo and Juliet  Entire Play.txt";
		
		ob.Decompress(input_names, output_names);
		
		
		input_names[0]=IN_FILE_PATH_2;
		output_names[0]=OUT_FILE_PATH_2;
		//ãçéñä ùì úîåðä
		ob.Compress(input_names, output_names);
		
		input_names[0] = OUT_FILE_PATH_2;
		output_names[0]= "C:\\Decompress Red_Flowers.bmp";
		
		ob.Decompress(input_names, output_names);
		
		HuffmanBetterEnDe ob1 = new HuffmanBetterEnDe();
		
		input_names[0] = IN_FILE_PATH_3;
		output_names[0]= OUT_FILE_PATH_3;
		//ñòéó á' ãçéñä îùåôøú
		ob1.Compress(input_names, output_names);
		
		input_names[0] = OUT_FILE_PATH_3;
		output_names[0]= "C:\\first decompress Smiley.bmp";;
		ob.Decompress(input_names, output_names);
		
	}
}


