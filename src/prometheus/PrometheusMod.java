package prometheus;

import arc.Core;
import arc.Events;
import arc.util.Log;
import arc.util.Time;
import mindustry.ctype.ContentList;
import mindustry.game.EventType;
import mindustry.mod.Mod;
import mindustry.ui.dialogs.BaseDialog;
import prometheus.content.*;

public class PrometheusMod extends Mod{

    private final ContentList[] prometheusContent = {
            new PrtItems(),
            new PrtBlocks(),
            new PrtLiquids()
    };

    public PrometheusMod(){

        //listen for game load event
        Events.on(EventType.ClientLoadEvent.class, e -> {
            //show dialog upon startup
            Time.runTask(10f, () -> {
                BaseDialog dialog = new BaseDialog("Hello");
                dialog.cont.add("behold").row();
                //mod sprites are prefixed with the mod name (this mod is called 'example-java-mod' in its config)
                dialog.cont.image(Core.atlas.find("prometheus-icon")).pad(20f).row();
                dialog.cont.button("Ok", dialog::hide).size(100f, 50f);
                dialog.show();
            });
        });
    }

    @Override
    public void init(){
    }

    @Override
    public void loadContent(){
        for(ContentList list : prometheusContent){
            list.load();

            Log.info("@: Loaded content list: @", getClass().getSimpleName(), list.getClass().getSimpleName());
        }
    }
}
