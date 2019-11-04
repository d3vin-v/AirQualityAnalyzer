class Main {

  // make sure to pass the correct arguments when calling the methods

  public static void main(String[] args) {
    
  //create 2 arrays, one for the city names, one for the PM2.5 levels
  String cities[] = {"Colombo", "Bandaranaike International Airport", "Dambullagama", "Dehilwala-Mount Lavinia", "Galle", "Gampaha District Station", "Horana", "Jaffna", "Kalmunai", "Kandy", "Kankasanturai", "Katunayake", "Kolonnawa", "Nawalapitiya Station", "Norochcholai", "Ratmalana Airport", "Ratnapura New Town"};
  int pm[] = {51, 58, 42, 54, 44, 64, 58, 65, 43, 59, 41, 52, 54, 58, 46, 52, 50};


  //call the printData, to print all the cities and their PM2.5 level
  // printData(cities[], pm[]);

  //call the findMax method and print all the cities with the worst air quality
  int maxC = findMax(pm[]);
  System.out.println("---Worst Air Quality---\nCity: " + cities[maxC] + " PM2.5: " + pm[maxC]);


  //call the findMin method and print all the cities with the best air quality
  int minC = findMin(pm[]);
  System.out.println("---Best Air Quality---\nCity: " + cities[minC] + " PM2.5: " + pm[minC]);

  } //end of main method
  double avg;
  public void avg(int[] p){
    double total;
    for(int i = 0; i < p.length; i++){
      total += p[i];
    }
    avg = total/2;
  }

	// The method below should print all of the data as a table. 
	// The method uses paramaters c which is the array of cities and p which is the array of pollution data values.
	public static void printData(String[] c, int[] p){
    for(int i = 0; i < c.length; i++){
      System.out.println("City: " + c[i] + " PM2.5: " + p[i]);
    }
	}

	// The method below should find the maximum pollution value in the array p and return the maxinum pollution value
	// The method uses the parameter p which is the array of pollution data values.
	public static int findMax(int[] p) {
    int max = p[0];
    int maxL = 0;
    for(int i = 0; i < p.length; i++){
      if(max < p[i]){
        max = p[i];
        maxL = i;
      }
    }
		return maxL;
	}

	// The method below should find the minimum pollution value in the array p and should return the minimum pollution value
	// The method uses the parameter p which is the array of pollution data values.
	public static int findMin(int[] p) {
    int min = p[0];
    int minL = 100;
    for(int i = 0; i < p.length; i++){
      if(min > p[i]){
        min = p[i];
        minL = i;
      }
    }
		return minL;
	} 
}
