package example.java.arrays;

public class Array2Dimension{

    public static void main(String[] args){
        Integer[][] values = { 
            {1,2,3}, 
            {2,3,5}, 
            {3,4,5} 
        };

		// menampilkan data pada index ke 0 dan 2
		System.out.println(values[0][2]);

		// menampilkan isi yang ada di array 2 dimention
		for(int x = 0; x < 3; x++){
			for(int y = 0; y < 3; y++){
				System.out.print(values[x][y]);
			}
			System.out.println();		
        }

        // x = 0 & y = 0 => 1 
        // x = 0 & y = 1 => 2
        // x = 0 & y = 2 => 3
        // x = 1 & y = 0 => 2
        
    }
}