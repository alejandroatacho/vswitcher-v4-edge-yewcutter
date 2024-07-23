java 
v.getWalking().setDistanceSpreader(8);
WorldPoint[] path = new WorldPoint[]{
    new WorldPoint(3093, 3494, 0),
    new WorldPoint(3089, 3488, 0),
    new WorldPoint(3088, 3470, 0),
    new WorldPoint(3087, 3478, 0)
};

if(v.getInventory().inventoryFull()) {
  if (v.getWalking().nearEntity(Entity.GAME, 10355, 20)) {
      if (!v.getWalking().isMoving()) {
          v.getBank().depositAll();
          v.getWalking().clearPathQueue();
      }
  } else {
      v.getWalking().walkPath(path);
  }
} else {
    if(v.getWalking().nearEntity(Entity.GAME, 10822, 20)) {
        if(v.getLocalPlayer().hasAnimation(-1)) {
            v.getWoodcutting().chop(10822);
        }
    } else {
        v.getWalking().walkPathReverse(path);
    }
}