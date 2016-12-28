package GraphsDataStructures;

public class FindIsland {
	
	static int findIslands(int[][] island) {
		int count = 0;
		boolean[][] lookUp = new boolean[island.length][island[0].length];
		for (int i = 0;i < island.length;i++) {
			for ( int j =0; j< island[0].length; j++) {
				if(island[i][j]==1 && !lookUp[i][j]) {
					lookUp[i][j] = true;
					lookUp = findConnectors(island,i,j,lookUp);
					//System.out.println();
					count++;
				}
			}
		}
		return count;
	}
	
	static boolean[][] findConnectors(int[][] island,int i,int j, boolean[][] lookUp) {
		int rowStart,colStart,rowEnd,colEnd;
		//System.out.print("("+i+","+j+")"+" ");
		rowStart = Math.max(i-1, 0);
		rowEnd = Math.min(i+1, island.length-1);
		colStart = Math.max(j-1, 0);
		colEnd = Math.min(j+1, island.length-1);
		for (int k = rowStart; k<=rowEnd; k++) {
			for (int m = colStart; m<=colEnd; m++) {
				if(island[k][m]==1 && !lookUp[k][m]) {
					lookUp[k][m] = true;
					findConnectors(island,k,m,lookUp);
				}
			}
		}
		return lookUp;
	}
	public static void main(String[] args) {
		int[][] island = {{0,0,0,1,0},{0,1,0,0,1},{1,0,1,0,0},{0,0,0,0,1},{1,1,0,0,0}};
		System.out.println(FindIsland.findIslands(island));
	}
}
/*
{0,0,0,1,0}
{0,1,0,0,1}
{1,0,1,0,0}
{0,0,0,0,1}
{1,1,0,0,0}
*/


