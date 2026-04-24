class Accident{
private no_of_injured = 0;
public Accidents(int no_of_injured){
this.no_of_injured = no_of_injured;
}
public String getStringAccident(){
if(no_of_injured>=10)
return "Disaster";
else if(no_of_injured>3)
return "Major Accident";
else return "Fatal Accident";
}
}
