///ENVIRONMENT///

//FUNCTIONS//

function newFloor(name, variants, speedMultiplier, emitLight, lightRadius){
  const floor = extendContent(Floor, name, {});
  floor.variants = variants;
  floor.speedMultiplier = speedMultiplier;
  floor.emitLight = emitLight;
  floor.lightRadius = lightRadius;
  
  return floor;
};

function newLiquidFloor(name, variants, speedMultiplier,){
  const liqFloor = extendContent(Floor, name, {});
  liqFloor.isLiquid = true;
  liqFloor.variants = variants;
  liqFloor.speedMultiplier = speedMultiplier;
  //SuperJaba2000 НАПИШЕТ!
  
  return liqFloor;
};

function newBlock(name, variants, solid){
  const StaticBlock = extendContent(StaticWall, name, {});
  StaticBlock.variants = variants;
  StaticBlock.solid = solid;
  
  return StaticBlock;
};

//ATTEIBUTES and OTHER write separately!!!

//CONTENT//

const whiteStoneWall = newBlock("white-stone-block", 1, true);
const whiteStoneFloor = newFloor("white-stone-floor", 2, 1.0, false, 0.0);
