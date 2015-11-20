package simon_4_game;

//You cant make a text based game without the scanner import.
import java.io.File;
import java.util.Scanner;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Simon_4_Game {
    //These strings are for user input
    //The int is for if theyy want to play
    //the boolean is unused.
    static String Input;
    static boolean dead;
    static String username;
    static int wanttoplay = 2;
    static int count;

    public static void main(String[] args) {

        //This while loop marks if the player wants to continue playing.
        //If they say yes, it will continue, if no, it will end.
        if (wanttoplay > 1) {
            playSound();
            
        }
        else { while (wanttoplay < 1) {
        gameover();
        
        }
        while (wanttoplay > 1) {
            playSound();
        }
        }
        }
          
    //This imports music.You must donwload the song and change the file location below.
    static void playSound() {
    try {
     AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("/home/NotSimon/Desktop/Music For Game.wav").getAbsoluteFile());
     Clip clip = AudioSystem.getClip();
       clip.open(audioInputStream);
       clip.start();
       begin();
    }
    catch(Exception ex) {
        System.out.println("Error playing sound.");
        ex.printStackTrace();
    }
    
    }
    
    
    
    static void begin() {
        //This is a scanner that causes the line below to ask for user input. 
        Scanner yes = new Scanner(System.in);
        System.out.println("Hello, Welcome to Abandoned. Can you please answer a few questions for me? Yes or No?");
        Input = yes.nextLine();
        //This if statement says, if they say yes, it will cause the commands below.
        if("yes".equalsIgnoreCase(Input)) {
            System.out.println("Awesome!");
            questions();
        }
        //This if statement says, if they say no, it will cause the commands below.
        else if("No".equalsIgnoreCase(Input)) {
            System.out.println("Well, you will have a hard time playing this game then.");
            System.out.println("Please answer the questions.");
            questions();
        }
        else {
        System.out.println("Please input Yes or No.");
        begin();
        }
        
        

    }
    
    static void questions() {
         //This is a scanner that causes the line below to ask for user input. 
        Scanner name = new Scanner(System.in);
        Scanner rooms = new Scanner(System.in);
        System.out.println("What's your name?");
        username = name.nextLine();
        System.out.println("Welcome " + username + ", are you scared of dark rooms?");
        Input = rooms.nextLine();
        if("Yes".equalsIgnoreCase(Input)) {
            System.out.println("Unfortunately, this game is based on entering and leaving dark rooms.");
            System.out.println("All in all, let's not give anything away, and just get started.");
            ready();
          
        }
            else if("No".equalsIgnoreCase(Input)) {
                System.out.println("Good! You will enjoy this game!");
                ready();
                    
        }
            else {
                System.out.println("Please type Yes or No.");
                questions();
            }
            
        }
        
        
    static void begingame() {
        
        System.out.println("");
        System.out.println("You are trapped in a abandoned hospital. All you can remember is the outbreak.");
        System.out.println("You don't know what the outbreak was of. You just remember your name, " + username + ".");
        System.out.println("When you leave the bed, you see a dim light that flickers into the room at the pace of less than a second.");
        System.out.println("Although, the light remains in the room long enough for you to see a trail of blood.");
        System.out.println("You walk to the door and see two hallways, one with a flickering light that you think you can see a body at the end of,");
        System.out.println("and a dark hallway with no light at all.");
        System.out.println("You turn around and see a window with a ledge you can shimmey on.");
        System.out.println("What path do you choose? Dark, Flicker or Window?");
        choice();
    }
        
    static void choice() {
     //This is a scanner that causes the line below to ask for user input. 
        Scanner choice = new Scanner(System.in);
        Input = choice.nextLine();
        if("dark".equalsIgnoreCase(Input)) {
            dark();
        }
        else if("flicker".equalsIgnoreCase(Input)) {
            flicker();
        }
        else if("window".equalsIgnoreCase(Input)) {
            window();
        }
        else {
            System.out.println("Please input Dark, Flicker, or Window.");
            choice();
        }
    }

    static void ready() {
         //This is a scanner that causes the line below to ask for user input. 
        Scanner ready = new Scanner(System.in);
        System.out.println("Ready to begin?");
        Input = ready.nextLine();
        if("yes".equalsIgnoreCase(Input)) {
            begingame();
        }
        else if("no".equalsIgnoreCase(Input)){
            System.out.println("Too Bad, Here we go!");
            begingame();
        }
        else {
            System.out.println("Please input Yes or No.");
            ready();
        }
    }
    
    static void dark() {
        
        System.out.println("");
        System.out.println("You walk into the dark hallway. You see nothing, nor do you hear anything.");
        System.out.println("As you walk along, you hear a faint noise. You casually stop as you hear your heart beat rise.");
        System.out.println("When you continue walking you see glass beneath your feet. You assume that was causing the noise.");
        System.out.println("After walking for a few minutes, glass slides through your shoe, and slides deep into your heel.");
        System.out.println("You release a loud scream, and automatically cover your mouth with your hand.");
        System.out.println("Your adrenaline rises at an incredible race, and the lights turn on. You aren't sure if you should");
        System.out.println("be releived or even more worried. When you lift your head from looking at the ground, you see a note");
        System.out.println("on the floor.");
        System.out.println("Do you open the note, or do you leave it?");
        notechoice();
    }
    
    static void notechoice() {
         //This is a scanner that causes the line below to ask for user input. 
        Scanner note = new Scanner(System.in);
        Input = note.nextLine();    
        if("open note".equalsIgnoreCase(Input)) {
            opennote();
            
        }
        else if("leave it".equalsIgnoreCase(Input)) {
            leavenote();
        }
        else {
            System.out.println("Please input Open Note, or Leave It.");
            notechoice();
        }
    }

    static void flicker() {
            System.out.println("You walk into the hallway with a light flickering on and off every two or so seconds.");
            System.out.println("You feel like you can see a body at the end of it but you continue to move forwards.");
            System.out.println("As you move up, you hear a noise behind you. Do you turn or keep walking?");
            turnchoice();
    
}
    
    static void turnchoice() {
        //This is a scanner that causes the line below to ask for user input. 
        Scanner turn = new Scanner(System.in);
        Input = turn.nextLine();
        if("turn".equalsIgnoreCase(Input)) {
            turn();
        }
        else if("keep walking".equalsIgnoreCase(Input)) {
            walk();
        }
        else {
            System.out.println("Please input Turn or Keep Walking.");
            turnchoice();
        }
    }
    static void turn() {
        System.out.println("");
        System.out.println("When you turn around, someone is behind you heavily breathing,");
        System.out.println("and carrying a knife that shines every time the light behind you");
        System.out.println("flickers. You try to run but its too late. He's caught your");
        System.out.println("jacket and pulled you back. He lays you on the ground and closes");
        System.out.println("your eyes. You let him do so, and say goodbye to your life.");
        System.out.println("");
        System.out.println("Game Over " + username + ".");
        System.out.println("");
        wanttoplay();
        
        
    }
    static void walk() {
        System.out.println("As you keep walking, you see an exit sign. You decide to follow the exit");
        System.out.println("signs until you reach a door. You don't know what to do. It almost seemed");
        System.out.println("to easy. Do you go through or do you turn around?");
        goorturn();
        
        
    }
    static void goorturn() {
        Scanner go = new Scanner(System.in);
        Input = go.nextLine();
        if("Go Through".equalsIgnoreCase(Input)) {
            go();
        }
        else if("Turn Around".equalsIgnoreCase(Input)) {
            Turn();
        }
        else {
            System.out.println("Please input Go through or turn around.");
            goorturn();
        }
    }
    static void go() {
        System.out.println("");
        System.out.println("You go through the door and reach safety. You don't remember much.");
        System.out.println("Yet, you have a lot of time to catch up on what's been going on.");
        youwin();
    }
    static void Turn() {
        System.out.println("");
        System.out.println("You turn around and there's darkness. Gas enflames the room through");
        System.out.println("the vents, and you aren't sure why. You drop to the floor and die.");
        System.out.println("");
        System.out.println("Game Over, " + username + ".");
        System.out.println("");
        wanttoplay();
    }
    static void window() {
            System.out.println("");
            System.out.println("You grab the window ledge and lift yourself onto the the seams of the wall. There are no lights around you.");
            System.out.println("As you shimmey along, the seams of the brick end. Your foot slips and you fall to the conctruction sight beneath you. ");
            System.out.println("There is a ladder on the sight back up to the floor you were once one, but it also looks like");
            System.out.println("the site goes on for a bit longer. Ladder or Site?");
            ladderorsite();

}
    static void ladderorsite() {
        Scanner site = new Scanner(System.in);
        Input = site.nextLine();
        if(Input.equalsIgnoreCase("Ladder")) {
            ladder();
        }
        else if(Input.equalsIgnoreCase("Site")) {
            site();
        }else {
            System.out.println("Please input Site or Ladder.");
            ladderorsite();
        }
    }
    
    static void ladder() {
        System.out.println("");
        System.out.println("You ckimb up the ladder and reach the floor you were once on. But it seems different.");
        System.out.println("As you walk along, you realize there is one less wooden board to stand on every section you");
        System.out.println("progress through. Three. Two. One. None. Dead end. This is where your parkour skills need to");
        System.out.println("kick in. Memorys start flooding back of when you used to parkour off of buildings. Yet, you");
        System.out.println("don't remember how. Jump or turn around?");
        jumporturn();
    }
    
    static void jumporturn () {
        Scanner jump = new Scanner(System.in);
        Input = jump.nextLine();
        if(Input.equalsIgnoreCase("Jump")) {
            jump();
        }
        else if(Input.equalsIgnoreCase("Turn Around")) {
            turnaround();
        }
        else {
            System.out.println("Please input turn around or jump.");
            jumporturn();
        }   
    }
     
    static void turnaround() {
            System.out.println("When you turn around, you forget there is only one plank to step on. You");
            System.out.println("Miss a plank and fall six floors to your death.");
            System.out.println("");
            System.out.println("Game Over " + username + ".");
            System.out.println("");
            wanttoplay();
        }
    
    static void jump() {
        System.out.println("You run from the one plank, and jump to the other side. Barely grasping a bar");
        System.out.println("you use your body strength plus the adrenaline pumping in your veins to get you up.");
        System.out.println("Once you lift yourself up to the top you continue to walk along the site. With your");
        System.out.println("head dizzy, you sit to take a break. You fall asleep. Waking up two hours later to a scream,");
        System.out.println("you don't know if you should go or not. Go or Stay?");
        goorstay();
    }
    
    static void goorstay() {
        Scanner go = new Scanner(System.in);
        Input = go.nextLine();
        if(Input.equalsIgnoreCase("Go")) {
            go1();
        }
        else if(Input.equalsIgnoreCase("stay")) {
            stay();
        }
        else {
            System.out.println("Please input go or stay.");
            goorstay();
        }
    }
    
    static void go1() {
        System.out.println("When you go the the scream and look in the window, someone is there");
        System.out.println("with a knife. They come at you and you have no where to go.");
        System.out.println("Standing still, you die a terrible death.");
        System.out.println("");
        System.out.println("Game Over " + username + ".");
        System.out.println("");
        wanttoplay();
        }
    
    
    
    static void stay() {
        System.out.println("When you stay, an ambulance pulls up and you are saved.");
        System.out.println("They throw a rope up to you, you secure it, and rapple your");
        System.out.println("way down.");
        System.out.println("");
        youwin();
}
    
    static void site() {
        System.out.println("You walk along the site and see ladders down to safety. You made it");
        System.out.println("down safe and sound and are glad you had no really bad hardships.");
        System.out.println("");
        youwin();
    }

    static void opennote() {
        
            System.out.println("");
            System.out.println("You reach down and grab the note. It says \"Your mom is dead. She's in the room 508.\"");
            System.out.println("Your heart drops once again. You can no longer see straight. Then, everything is black.");
            System.out.println("You wake up with the note in your hand. Laying on the floor with blood on the ground.");
            System.out.println("Your back is sore and you can't make up the fact you landed on glass. There are three glass");
            System.out.println("pieces in your back. You reach back and pull them out. Screaming as you do so. Then you remember");
            System.out.println("that your mom is supposedly dead. Yet... Maybe someones messing with you?");
            System.out.println("Should you get your mom or leave her?");
            System.out.println("Type, Get Mom or Leave Mom.");
            momchoice();
        
    }

    static void leavenote() {
        System.out.println("");
        System.out.println("You left the note and walk to the end of the dark hallway. There");
        System.out.println("is nothing there for you to do. You stand looking at the wall you can't see.");
        System.out.println("You reach your arms out to feel the seams of the walls and you walk across");
        System.out.println("the hall, with your hands sliding across the unwillingly easy wall. You decide");
        System.out.println("to indulge some pressure on it, and you hear a slight crack, Do you continue to");
        System.out.println("push or do you leave the wall and look for an extra way out?");
        leftchoice();
    }
    static void leftchoice() {
        Scanner left = new Scanner(System.in);
        Input = left.nextLine();
        if(Input.equalsIgnoreCase("Push")) {
         push();
        }
        else if(Input.equalsIgnoreCase("Look")) {
            look();
        }
        else {
            System.out.println("Please input Look or Push.");
        }
    }
    
    static void push() {
        System.out.println("");
        System.out.println("When you push, you hear a ding. A green light shines in your face.");
        System.out.println("You then realize it's an elevator. The door slides open, squeaking");
        System.out.println("as it goes, and when you decide to step in you realize there is no");
        System.out.println("floor. About to fall to your death, you throw your jacket and the door");
        System.out.println("catches the end of an armhole. Dangling, you rely on your arms strength");
        System.out.println("to hold you up. Suddenly, there's a faint ding. The door slides open, and");
        System.out.println("you fall to your death.");
        System.out.println("");
        System.out.println("Game Over " + username + ".");
        System.out.println("");
        wanttoplay();
    }

    static void look() {
        System.out.println("");
        System.out.println("You look around for another way out of this place. As you look around");
        System.out.println("you notice a pressure on your shoulder, you turn around and it's someones");
        System.out.println("foot. Someone is hanging from the ceiling and you can see blood fall as it");
        System.out.println("lands on your forehead. Disgusted, you slightly vomit in your mouth. After");
        System.out.println("cleansing yourself, you lift up your head and realize an exit sign, glowing red");
        System.out.println("in the dark. You run over and it's a way out! Completely safe from what coud have");
        System.out.println("tragedy, you run far away from the hospital. Never to come back.");
        System.out.println("");
        youwin();
        
    }

    static void momchoice() {
            Scanner mom = new Scanner(System.in);
            Input = mom.nextLine();
        
        if(Input.equalsIgnoreCase("Get Mom")) {
                getmom();
                
            }
            else if(Input.equalsIgnoreCase("Leave Mom")) {
                leavemom();
                
            }
            else {
              System.out.println("Please input Get Mom, or Leave Mom.");
              momchoice();
            }


    }
    static void leavemom() {
        System.out.println("");
        System.out.println("You leave your mom behind and are left with the pain of regret.");
        System.out.println("You sit down with your head in your hands, remembering how she raised you.");
        System.out.println("You then hear footsteps. You lift your head and there is a face there.");
        System.out.println("It's not your mom, or anyone you know for that matter. They slide a knife from");
        System.out.println("their boot and you grab its hand and try to fight it. It manages to release");
        System.out.println("you from his grip and all of the power is left impaling you in the throat.");
        wanttoplay();
    
    }
    static void getmom() {
        
        System.out.println("");
        System.out.println("You know you are on floor six because the room in front of you says 611.");
        System.out.println("You must look around for a way down.. After walking around, you find an");
        System.out.println("elevator and a set of stairs?");
        System.out.println("Where do you go, Elevator or Stairs?");
        downchoice();
        
    }
    
    static void downchoice() {
        Scanner down = new Scanner(System.in);
        Input = down.nextLine();
        if("elevator".equalsIgnoreCase(Input)) {
            elevatordeath();
        }
        else if("stairs".equalsIgnoreCase(Input)) {
            stairs();
        }
        else {
            System.out.println("Please input, Elevator or Stairs.");
            downchoice();
        }
    
    }
    
    static void elevatordeath() {
        
        System.out.println("");
        System.out.println("The elevator is shaky as you go down, and all of a sudden...");
        System.out.println("It goes silent. The elevator is no longer connected. As you fall");
        System.out.println("to your death, you pray that your mom is okay.");
        System.out.println("");
        System.out.println("Game Over " + username + ".");
        System.out.println("");
        wanttoplay();
        
    }
    
    static void stairs() {
        System.out.println("");
        System.out.println("You walk down the dusty set of stairs and see the room 511.");
        System.out.println("You must walk across the hall to your right to reach room 508.");
        System.out.println("Before you arrive, you hear a scream, you run to the room and your mom \nis on the floor with blood on the ground.");
        System.out.println("The window is open, and the hall is empty behind you.");
        System.out.println("Window or Hall?");
        deadmom();
    }
    
    static void deadmom() {
      Scanner mom = new Scanner(System.in);
        Input = mom.nextLine();
        if("Hall".equalsIgnoreCase(Input)) {
            momhall();
        }
        else if("Window".equalsIgnoreCase(Input)) {
            momwindow();
        }
        else{
            System.out.println("Please input Window or Hall.");
            deadmom();
        }
    }
    
    static void momhall() {
        System.out.println("");
        System.out.println("You leave the hall and hear a shuffle from the room. You turn around");
        System.out.println("and the killer climbs in the window. That's the last thing you remember.");
        System.out.println("");
        System.out.println("Game Over " + username + ".");
        wanttoplay();
    }
    
    static void momwindow() {
        System.out.println("");
        System.out.println("You climb out the window and fall to the construction site below.");
        System.out.println("Your back hurts badly, but atleast you've made it to safety.");
        System.out.println("You still have a pain in the back of your throat because your");
        System.out.println("mom is dead. Yet, you are happy that you have achieved safety");
        System.out.println("and now need to find out what life is inflamed around you.");
        youwin();
        
        
        
    
    }
    
    static void wanttoplay() {
        System.out.println("Do you want to play again?");
         //This is a scanner that causes the line below to ask for user input. 
        Scanner play = new Scanner(System.in);
        Input = play.nextLine();
        if("yes".equalsIgnoreCase(Input)) {
            //if they say yes it will add two lives, that is over 0 so the while loop will
            //pick it up.
            wanttoplay = 2;
            begin();
            
        }
        else if("no".equalsIgnoreCase(Input)) {
            System.exit(0);
            
        } else {
            System.out.println("Please input Yes or No.");
        }
    }
    
    static void gameover() {
        
    }
    
    static void youwin() {
        System.out.println("");
        System.out.println("You won! Congratulations, I know it was hard with all of the complications");
        System.out.println("had to deal with. But you lived through it. Bravo!");
        System.out.println("");
        System.out.println("Thanks for playing my game!");
        System.out.println("");
        System.out.println("              -Hunter Simon"); 
    }
}