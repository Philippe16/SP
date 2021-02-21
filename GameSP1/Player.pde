class Player
{
 int x;
 int y;
 int type = 1;
 int HP;
 int Points;
 
 
 Player(int y, int x)
 {
   this.x=x;
   this.y=y;
   HP=100;
   Points=0;
 }
 // Lose 1 health each time an enemy hits you.
void loseHP(){
    for(int i = 0; i < enemyArr.length; i++){
      if(dist(enemyArr[i].x, enemyArr[i].y, x, y) == 0){
        
        if(HP > 0){
          HP--;
          println("-1 HP"+HP);
        }else{
          println("YOU LOSE");
          setup();
        }
        

      }
    }
  }
  // Points for the cookies, if you get 10 you win.
  void gainPoints(){
    for (int i = 0; i < cookieArr.length; i++) {
     if(dist(cookieArr[i].x, cookieArr[i].y, x, y) == 0){
     if(Points <9){
          Points++;
          println("Points:"+Points);
          cookieArr[i].x = (int)random(0, 29);
          cookieArr[i].y = (int)random(0, 29);
        }else{
          println("10 POINTS!YOU WIN");
          setup();
        } 
     }
  }
  } 
  
  // A score increaser, so whenever the player touches a cookie, the score will increase by 1.
//void increaseScore()
//{
//int xCookiesToPlayer = Math.abs(player.x - cookies.x);
//int yCookiesToPlayer = Math.abs(player.y - cookies.y);

//if (xCookiesToPlayer <= 40 && yCookiesToPlayer <= 40)
//{
////player.score++;
////cookies.x = (int)random(0,29);
////cookies.y = (int)random(0,29);
//}
}
