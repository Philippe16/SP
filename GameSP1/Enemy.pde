class Enemy
{
  int x; 
  int y; 
  int type = 2; 
  Player player;

  Enemy(int x, int y, Player player)
  {
    this.x = x;
    this.y = y;
    this.player = player;
  }
// The movement for the enemies with constrain.
  void huntPlayerX()
  {
    for(int i =0;i<enemyArr.length;i++){
    
    
    if (player.x < enemyArr[i].x) {

      enemyArr[i].x--;
      enemyArr[i].x = constrain(enemyArr[i].x, 0, 29);
    } 
    if (player.x > enemyArr[i].x) {


     enemyArr[i].x++;
      enemyArr[i].x = constrain(enemyArr[i].x, 0, 29);
    }
    }
  }
  void huntPlayerY()
  {
    for(int i =0;i<enemyArr.length;i++){
    if (player.y < enemyArr[i].y) {

      enemyArr[i].y--;
      enemyArr[i].y = constrain(enemyArr[i].y, 0, 29);
    } 

    if (player.y > enemyArr[i].y) {
      enemyArr[i].y++;
      enemyArr[i].y = constrain(enemyArr[i].y, 0, 29);
    }
    }
  }
}
