package assign1;

public class TreeCoding
{
	int character_frequency;
	int data;
	TreeCoding left;
	TreeCoding right;

	public TreeCoding(int character_frequency, int data, TreeCoding left, TreeCoding right)
	{
		this.character_frequency = character_frequency;
		this.data = data;
		this.left = left;
		this.right = right;
	}
	
	public void encoding_for_each_character(TreeCoding root, String character_encoding, String[] array_of_encodings) 
	{ 
		if (root.left == null && root.right == null )
		{
			System.out.println((char)root.data + " " + character_encoding);
			array_of_encodings[root.data] = character_encoding;
			return; 
		} 

		encoding_for_each_character(root.left, character_encoding + "0", array_of_encodings); 
		encoding_for_each_character(root.right, character_encoding + "1", array_of_encodings); 
	}
}
