abstract class ToyBase{
  private String name;
  private String description;
  private String script;
  private String act;

  public ToyBase(String name){
    this.name = name;
  }
  public String getName(){
    return this.name;
  }
  public String getDescribe(){
    return this.description;
  }
  // public void setDescribe(String description){
  //   this.description = description;
  // }
  public String getScript(){
    return this.script;
  }
  public void setScript(String script){
    this.script = script;
  }
  public String getAct(){
    return this.act;
  }
  public void setAct(String act){
    this.act = act;
  }

 
  public void act(String name,String verb){
    System.out.println(name+" " +verb+".");
  }
  public void act(String name, String verb, String plus){
    System.out.println(name+" " +verb+" "+plus+".");
  }
  public void speak(String name, String script){
    System.out.println(name+ " said "+ "'"+script+"'");
  }
  public void speak(String from, String to,String script){
      System.out.println(from + " told "+to+", '"+script+"'");
  }
  public void look(String name, String plus){
      System.out.println(name + " looked "+plus+".");
  }
  public void walk(String name, String plus){
      System.out.println(name+" walked "+plus+".");
  }
}

class Buzz extends ToyBase{ //버즈
  public Buzz(String name, String buzzObj){
    super(name);
    this.buzzObj = buzzObj;
  }
  private String buzzObj;
  
  public String getBuzzObj(){
    return this.buzzObj;
  }
  public void setBuzzObj(String buzzObj){
    this.buzzObj = buzzObj;
  }
  
  public void laser(){
      System.out.println("Buzz shoot laser to Woody");
  }
  public void communicateByRadio(){
      System.out.println("Buzz radioed 'Buzz Lightyear to Star Command. Star Command. Star Command come in.'");
  } 
}

class Woody extends ToyBase{ //우디
  public Woody(String name, String woodyObj){
    super(name);
    this.woodyObj = woodyObj;
  }
  
  private String woodyObj;
  
  public String getWoodyObj(){
    return this.woodyObj;
  }
  public void setWoodyObj(String woodyObj){
    this.woodyObj = woodyObj;
  }

  




}

class Spaceship extends ToyBase{ 
  private String state;
  public Spaceship(String name, String state){
    super(name);
    this.state = state;
  }
  public String getState(){
    return this.state;
  }

  public void getShipState(){
      System.out.println("Spaceship is "+getState()+".");
  }
}

public class ToyStory3 {
  public static void main(String[] args){
      Buzz buzz = new Buzz("Buzz","the panel on the arm");
      String b = buzz.getName();
      Woody woody = new Woody("Woody","Woody's star shaped sheriff badge");
      String w = woody.getName();
      Spaceship spaceship = new Spaceship("spaceship","crashed and upside-down");
      String s = spaceship.getName();

      buzz.setAct("is stading");
      buzz.act(b,buzz.getAct(), "on the bed");
      
      buzz.setDescribe("around");
      buzz.look(b, buzz.getDescribe());
      woody.setAct("is suprised");
      woody.act(w,woody.getAct());
      buzz.setAct("is blinking his eyes");
      buzz.act(b,buzz.getAct());
      buzz.look(b, "around");
      woody.act(w,"hided himself");
      buzz.communicateByRadio();
      buzz.setScript("Do you read me. I don't answer my ship.");
      buzz.speak(b,buzz.getScript());

      buzz.look(b, s);
      spaceship.getShipState();

      buzz.setScript("It'll take weeks to repair.");
      buzz.speak(b,buzz.getScript());
      buzz.act(b,"opened", buzz.getBuzzObj());

      buzz.setScript("Buzz Lightyear mission log start date 4:07. My ship is out of course on route to sector 12, crash land on a strange planet. The impact must have woke me from hyper-sleep.");
      buzz.speak(b,buzz.getScript());
      buzz.act(b,"is jumping", "on the bed");
      buzz.speak(b,"Terrain seems a bit unstable.");
      buzz.setAct("is tapping");
      buzz.act(b,buzz.getAct(),buzz.getBuzzObj());
      buzz.speak(b,"If the air is breathable and there seems to be no sign of intelligent life anywhere.");
      woody.act(w,"poped up");
      woody.speak(w, b, "Hello!");
      buzz.speak(b,"Holly!");
      buzz.laser();
      woody.speak(b, w, "woah woah woah did I fright you? I didn't meant to. Sorry. My name is Woody and this is Andy's room. That's all I was planning to say and also there has been a bit of a mix-up. This is my spot to see the bed.");
      buzz.look(b,woody.getWoodyObj());
      buzz.speak(b, w, "Local law enforcement. It's about time you got here. I'm Buzz Lightyear, Space Ranger Universe Protection Unit. My ship is crash-landed here by mistake.");
      buzz.walk(b, "away");
      woody.speak(w,"Yes it's a mistake because you see the bed here is my spot");
      woody.walk(w, "behind Buzz");
      buzz.act(b,"turned around");
      buzz.speak(b,"To repair my turbo boosters.. Do people still use fossil fuels? Have you discovered Cristal occlusion? Well let's see where we got");
      buzz.walk(b, "to the spaceship");

  }
}



