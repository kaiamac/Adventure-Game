/*
 * Kaia Mac
 * Adventure Story
 * October 17th 2018
 */
package adventurestory;
import java.util.Scanner;
/**
 *
 * @author kamac8665
 */
public class AdventureStory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyedInput = new Scanner (System.in);
        
        String response1;
        String response2;
        String response3;
        String response4;
        String response5;
        String name;
        
        System.out.println("The Dream Chasers");
        System.out.println("Author: Eric Alderton & Kaia Mac");
        System.out.println("Editor: Kaia Mac");
        System.out.println("            ");
        System.out.println("           It was my first day at New Founding Patriots Orphanage in Boston and to be");
        System.out.println("quite honest, I couldn’t wait to go meet my new family. It felt different this time. When I");
        System.out.println("first walked in, I was amazed on how old everything was. The only nice thing thing there");
        System.out.println("was a T.V., however it was quite old. The Patriots game was on and there was two");
        System.out.println("people watching the game.");
        System.out.println("           “Hi you new here?”");
        System.out.println("           I looked to my right and saw a guy that looked like someone straight out of a");
        System.out.println("movie. Wearing a jean jacket, blue jeans and had jet black hair with so much gel in it, it ");
        System.out.println("was crazy.");
        System.out.println("            ");
        System.out.println("Please enter you name:");
        name = keyedInput.nextLine();
        System.out.println("           “Yes, I am new here. My name is "+ name +", what’s yours?” I responded.");
        System.out.println("           “I’m Eric and that’s Joe. take a seat and relax. You a Patriots fan?”");
        System.out.println("           Joe was short and he had brown curly hair and did not look like the happiest");
        System.out.println("person in the world.");
        System.out.println("           “Yes, I’m a huge Patriots fan!” The minute I said this, I knew I would fit in with");
        System.out.println("these two guys as they both looked at each other and then at me and replied,");
        System.out.println("           “Looks like we will be friends for a long time.”");
        System.out.println("           We spent the next few weeks having fun and watching the Patriots. One night");
        System.out.println("however, we got a knock on our door. It was the mother of the Orphanage, Miss.");
        System.out.println("Skywalker (Miss. Skye for short) . When we opened the door, she informed us that the");
        System.out.println("Orphanage would have to close down, due to the lack of funds. She had given us the ");
        System.out.println("option to transfer to a new orphanage, or get our own place, if we can afford it due to");
        System.out.println("our age.");
        System.out.println("            ");
        System.out.println("           Are you [A]going to move to the new orphanage, or [B]move into your own place");
        System.out.println("together with Joe and Eric?");
        System.out.println("{Please type the letter exactly as it looks that corresponds with your answer.}");
        response1 = keyedInput.nextLine();
        
            if (response1.equals("A")){
                System.out.println("           After a long discussion with Joe and Eric, we have decided that due to the lack of");
                System.out.println("money we have combined, we would just move into the new orphanage. Months past");
                System.out.println("and nothing new has changed, eventually each of them have found their very own");
                System.out.println("families and lived a very ordinary life.");
                System.out.println("The End.");
            }
            else if(response1.equals("B")){
                System.out.println("           After a long discussion with Joe and Eric, we have decided that due to the lack of");
                System.out.println("money we have combined, we have just enough money to afford a cheap small house");
                System.out.println("in Detroit. Although none of us has ever been to Detroit, we were all excited to start new");
                System.out.println("chapters in our lives as a family. ");
                System.out.println("           It was moving day and we had woken up at six a.m. to catch the bus to Detroit.");
                System.out.println("The bus ride felt like it would never end. Joe slept the entire way and Eric started to get");
                System.out.println("real annoying by singing his favorite song, “boats and inspirational women” on repeat. ");
                System.out.println("Soon after, about an hour into the drive to Detroit, Eric paused his singing and told me");
                System.out.println("something that really caught my eye.");
                System.out.println("           “This is a new life for us. We will make lots of money down here and absolutely ");
                System.out.println("no one will mess with us, a fresh start in a new City.”");
                System.out.println("           We finally got off the bus and none of us were impressed with what we were ");
                System.out.println("seeing. The houses were way older than the Orphanage. It was dark and gloomy, about");
                System.out.println("every five minutes you would hear police sirens. ");
                System.out.println("           “If I knew we were going to live in this neighbourhood, I would’ve rather slept on");
                System.out.println("a park bench outside Fenway Park, back in Boston.” Joe said as he looked out the");
                System.out.println("window of the taxi, taking the three of them to their new home. ");
                System.out.println("           As we approached our home on Eminem Avenue, the house was so old and");
                System.out.println("worn down. The steps to the front door were broken into pieces, even the house ");
                System.out.println("number was spray painted onto the front door in big numbers, 42. ");
                System.out.println("           “No wonder we could afford this house, it looks like it was built by crack heads.” ");
                System.out.println("When we first walked inside, it was no better than the outside. The front hallway wall ");
                System.out.println("had a massive hole in it, the back window was smashed in, beds had rat poop on it, the ");
                System.out.println("walls were covered in unimaginable graffiti and racial slurs, and the living room had so ");
                System.out.println("much junk in it, it was crazy. Joe walked into the bathroom to find a bum sleeping in the");
                System.out.println("bathtub.");
                System.out.println("            ");
                System.out.println("           Does Joe [A]Yell at the guy or [B]Hit the guy to get him out of the house?");
                System.out.println("{Please type the letter exactly as it looks that corresponds with your answer.}");
                response2 = keyedInput.nextLine();
                
                    if(response2.equals("B")){
                        System.out.println("           Joe Grabbed a baseball bat from the hallway and proceeded to hit the man over");
                        System.out.println("and over again, he had no self control and neither you or Eric tried to stop him. You all");
                        System.out.println("went to jail for killing an innocent bum.");
                        System.out.println("The End.");
                    }
                    else if(response2.equals("A")){
                        System.out.println("           “HEY! Get out of my house you bum!” Joe screamed and pushed the man out of");
                        System.out.println("the house.");
                        System.out.println("           Thankfully, Eric had brought some new doorknobs and locks for the doors and");
                        System.out.println("windows. It took about two hours for the three of us to go through the whole house and ");
                        System.out.println("thoroughly check each room for anything that shouldn’t be there. ");
                        System.out.println("           The three of us debated on where each of us were going to sleep for the night ");
                        System.out.println("since no one felt comfortable enough to sleep in the basement. It was cold, and there");
                        System.out.println("were creepy noises and all sorts of junk down there. ");
                        System.out.println("           At around 11:30pm, Joe came storming into the kitchen where Eric and I were");
                        System.out.println("playing tic tac toe on an old newspaper we found on the kitchen floor. I heard glass");
                        System.out.println("shattering outside. It sounded like something is going on that we should go check out.");
                        System.out.println("            ");
                        System.out.println("           Do they [A]go outside and investigate or [B]stay inside where it is safe?");
                        System.out.println("{Please type the letter exactly as it looks that corresponds with your answer.}");
                        response3 = keyedInput.nextLine();
                        
                            if(response3.equals("A")){
                                System.out.println("           We didn’t think much of it so we ran outside and went to go see what had ");
                                System.out.println("happened. As we came around the corner we saw that some poor lady was getting");
                                System.out.println("jumped! Before I could get any closer, Eric and Joe took off running back towards the");
                                System.out.println("house. I wanted to call the police and help stop this person. However, I felt like I had no");
                                System.out.println("choice as just to go back home before I got injured. When I came back inside, Eric and ");
                                System.out.println("Joe were sitting in the kitchen chatting away as if nothing had happened. I still couldn’t");
                                System.out.println("believe what happened, I felt terrible for not being more selfless and helping that poor");
                                System.out.println("lady who was getting jumped. I wanted to stop this criminal. The criminal heard the ");
                                System.out.println("three of us walking and started running right towards us with a baseball bat. Next thing");
                                System.out.println("we knew, we were on the ground bleeding. No one came to help us and we all died.");
                                System.out.println("The End.");
                            }
                            else if(response3.equals("B")){
                                System.out.println("           The next morning I came downstairs and Eric looked like he was up to ");
                                System.out.println("something.");
                                System.out.println("           “Is everything alright?“ I asked.");
                                System.out.println("           “"+name+",” Eric paused for a moment, “sit down we need to talk.” ");
                                System.out.println("           “Listen,"+name+" we are not making much money, and we all want better lives, but ");
                                System.out.println("we are not doing anything about it.” Joe explained.");
                                System.out.println("           “But! We came up with this idea to go to the convenient store just up the road");
                                System.out.println("and make just a little extra money.” Eric added.");
                                System.out.println("            ");
                                System.out.println("           Do you [A]rob the convenience store with them or [B]make up an excuse to why ");
                                System.out.println("you can’t help them?");
                                System.out.println("{Please type the letter exactly as it looks that corresponds with your answer.}");
                                response4 = keyedInput.nextLine();
                                
                                    if(response4.equals("B")){
                                        System.out.println("           “Sorry guys, I have a lot of job searching to do tonight, maybe another time ");
                                        System.out.println("though.” I said respectfully and kindly.");
                                        System.out.println("           “Alright, your loss.” The two of them replied in unison.");
                                        System.out.println("           When the two of them got back, they did not share anything that they got with ");
                                        System.out.println("you. You starved to death.");
                                        System.out.println("The End.");
                                    }
                                    else if(response4.equals("A")){
                                        System.out.println("           I truthfully did not not know how to respond, however I didn’t want to upset my ");
                                        System.out.println("only friends, hell I looked at Eric and Joe like my brothers so I felt like I had no choice.");
                                        System.out.println("           “Okay.” I responded softly.");
                                        System.out.println("           “Great! We will head out at around 10:35 pm tonight.” Replied Eric.");
                                        System.out.println("           Time couldn’t have gone any slower but it was finally 10:35 pm and I was ");
                                        System.out.println("shaking like crazy. We all headed out to the store.");
                                        System.out.println("           Joe was the first one in. He broke the window, Eric followed but I froze.");
                                        System.out.println("           “Are you coming or what?” Eric turned back.");
                                        System.out.println("           I was so nervous, I had a bad feeling about this. The sweat was dripping from my ");
                                        System.out.println("forehead, I only thought the worse. I finally went in.");
                                        System.out.println("           “John watch the door” Joe yelled.");
                                        System.out.println("           I couldn’t find my voice to respond, I was terrified. It felt like time had stopped. ");
                                        System.out.println("Joe finally rushed out with a bag of cash from the register and Eric ran out with food and ");
                                        System.out.println("the three of us took off down the street back home.");
                                        System.out.println("           That night I laid in my bed trying to understand why Eric and Joe would consider ");
                                        System.out.println("doing such a horrible thing. I felt terrible. I wanted to help people, not become a ");
                                        System.out.println("criminal. ");
                                        System.out.println("           Suddenly an idea popped into my head, maybe I should become a Police Officer, ");
                                        System.out.println("after all I am pretty fit. It only takes about six months of school and I can help people ");
                                        System.out.println("from danger as well as make enough money to afford a much nicer house in a much ");
                                        System.out.println("safer neighborhood. The only thing stopping me was the thought of Eric and Joe finding ");
                                        System.out.println("out that this is what I want to do.");
                                        System.out.println("           It had been an hour of thinking about it, and I still couldn’t decide how to tell my ");
                                        System.out.println("dear friends that I want to be a Police Officer. I decided to rest my head and sleep on it, ");
                                        System.out.println("hoping for an idea on how to tell them would pop into my mind. ");
                                        System.out.println("           The next morning I came downstairs. Joe and Eric were sitting in the kitchen ");
                                        System.out.println("talking. I walked out the door without saying a word to them. I walked straight down to");
                                        System.out.println("the police station to find out how I could become an officer. ");
                                        System.out.println("           When I arrived at the station, I was astonished. Chief of Police, Mr. J. Alexander, ");
                                        System.out.println("was very impressed with my backstory. Growing up through an overcoming Orphanage ");
                                        System.out.println("and being very fit, he was willing to personally train me himself. ");
                                        System.out.println("           “I’ll train you on one condition. You must be early everyday and never give me a ");
                                        System.out.println("hard time.” Mr. J. Alexander replied. ");
                                        System.out.println("           Weeks have passed and Eric came to me with the same look he had on his face ");
                                        System.out.println("the night of robbing the convenience store.");
                                        System.out.println("           “Is everything ok?”");
                                        System.out.println("           “Listen, "+name+" we didn’t tell you this, but over the past couple weeks we have ");
                                        System.out.println("been doing little jobs like the convenient store but truthfully we want more and we came ");
                                        System.out.println("up with the idea that were going to do a much bigger job.” Eric explained. ");
                                        System.out.println("           “What do you mean bigger?” I asked. ");
                                        System.out.println("           “We want to take down the local bank. Though this be madness, yet there be ");
                                        System.out.println("method in it.” Eric stated.");
                                        System.out.println("           I didn’t know what to say, I still had not told the two of them that I was training to ");
                                        System.out.println("be a local police officer. And now I have a crime told to me before it happens. I also ");
                                        System.out.println("realized, if I caught them while they were coming out of the bank, I would be given the ");
                                        System.out.println("job and could live a better life. With or without them.");
                                        System.out.println("           “So? Are you in or out?” Joe said with a smile on his face.");
                                        System.out.println("            ");
                                        System.out.println("           Do you [A]rob the bank with your friends or [B]turn them in? ");
                                        System.out.println("{Please type the letter exactly as it looks that corresponds with your answer.}");
                                        response5 = keyedInput.nextLine();
                                        
                                            if(response5.equals("A")){
                                                System.out.println("           “Okay. I am in.” I replied with a stutter. ");
                                                System.out.println("           The next morning I woke up to see Eric and Joe standing in the front hallway of ");
                                                System.out.println("the house. They both turned to me. ");
                                                System.out.println("           “You ready to do this tonight? Take this, you’ll need this!” Joe laughed as he ");
                                                System.out.println("threw a hand gun towards me.");
                                                System.out.println("           Truthfully, this was the first time I have ever held a gun before. I didn’t even know ");
                                                System.out.println("how to shoot. Mr. J. Alexander has yet to teach me how to handle a gun.");
                                                System.out.println("           “Meet us at the bank at nine tonight.” Eric commented. ");
                                                System.out.println("           Just as we’re leaving the bank after taking over $100,000, I can clearly see Mr. J. ");
                                                System.out.println("Alexander outside with gun drawn out and pointed right at me. Next thing I knew, I was ");
                                                System.out.println("shot in the chest and died just moments after.");
                                                System.out.println("The End.");
                                            }
                                            else if(response5.equals("B")){
                                                System.out.println("           “Okay. I am in.” I replied with a stutter. ");
                                                System.out.println("           The next morning I woke up to see Eric and Joe standing in the front hallway of ");
                                                System.out.println("the house. They both turned to me. ");
                                                System.out.println("           “You ready to do this tonight? Take this, you’ll need this!” Joe laughed as he ");
                                                System.out.println("threw a hand gun towards me.");
                                                System.out.println("           Truthfully, this was the first time I have ever held a gun before. I didn’t even know ");
                                                System.out.println("how to shoot. Mr. J. Alexander has yet to teach me how to handle a gun.");
                                                System.out.println("           “Meet us at the bank at nine tonight.” Eric commented. ");
                                                System.out.println("           I walked out the door and headed towards the police station. I told Mr. J. ");
                                                System.out.println("Alexander the plan. ");
                                                System.out.println("           “You will lead the crew tonight. We will all be there, however you will lead us.”");
                                                System.out.println("           It was 9:15pm and I pulled up to the bank with 5 other cop cruisers. About 20 ");
                                                System.out.println("minutes later, Eric and Joe all of a sudden came running out. Joe started firing his gun, ");
                                                System.out.println("Joe has never fired a gun before so his aim was really bad. The cops shot him in the left ");
                                                System.out.println("knee and once in the right shoulder. Eric surrendered and as he was being hauled into ");
                                                System.out.println("the back of one of the cruisers, he turned to me and said,");
                                                System.out.println("           “How could you do this to us? We’ve done nothing but good to you! Now we're ");
                                                System.out.println("both screwed because of you!”");
                                                System.out.println("           “You think I wanted to do this!? I looked at you guys as my brothers! but I didn’t ");
                                                System.out.println("want to live this life anymore. I need a real life.” ");
                                                System.out.println("           It was a horrible night, I was just hoping it would all be over and done with soon. ");
                                                System.out.println("           “Congrats John, you are now officially an Officer and have passed my training.” ");
                                                System.out.println("Mr. J. Alexander and the other officers on duty that night applauded me. ");
                                                System.out.println("           Although it was hard for me to take down Eric and Joe, it was necessary for me ");
                                                System.out.println("to do the right thing. The right thing in life is not always the easiest thing to do. It also ");
                                                System.out.println("helped me start a new pathway to a better, much greater future. ");
                                                System.out.println("The End.");
                                            }
                                
                                    }
                                
                            }
                    
                    
                    }
                
            }    
        
    }
    
}
