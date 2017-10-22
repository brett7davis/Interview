class frequent {
	public static void main(String[] args) {
		frequent miles = new frequent();
		int[]  train = new int[] {1, 2, 2, 5};
		System.out.println(miles.findFreq(train));
	}

	private static int findFreq(int[] arr) {
		int common = 0;
		int count = 0;
		int temp = 0;

		for (int i = 0; i < arr.length; i++) {
			temp = arr[i];
			int tempCount = 0;
			for (int j = 0; j < arr.length; j++) {
				if (arr[j] == arr[i]) {
					tempCount++;
				}
			}

			if (tempCount > count) {
				count = tempCount;
				common = temp;
			}
		}

		return common;

		//sort, for loop, 
	}
}