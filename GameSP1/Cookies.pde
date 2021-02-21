class Cookies
{
  int x; 
  int y; 
  int type = 3;
  Player player;

  Cookies(int x, int y, Player player)
  {
    this.x = x;
    this.y = y;
    this.player = player;
    
    
  }
  // Make the cookie appear random on the map.
  void move() {
    currentFrameCount = frameCount;
    int frameCountDifference = currentFrameCount - cookiesPrevFrameCount;

    if (frameCountDifference==18) {
      for (int i = 0; i < cookieArr.length; i++) {
        cookieArr[i].x = (int)random(0, 29);
        cookieArr[i].y = (int)random(0, 29);
      }

      cookiesPrevFrameCount=currentFrameCount;
    }
  } 
}
