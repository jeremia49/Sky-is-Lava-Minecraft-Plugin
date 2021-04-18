package pw.jeremia.SkyisLava

import org.bukkit.Location
import org.bukkit.Material
import org.bukkit.block.Block
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerMoveEvent
import org.bukkit.plugin.java.JavaPlugin

class Main : JavaPlugin(), Listener{
    override fun onEnable() {
        super.onEnable()
        server.pluginManager.registerEvents(this,this)
    }

    override fun onDisable() {
        super.onDisable()
    }

    @EventHandler
    fun onPlayerMove(event : PlayerMoveEvent){

        val loc: Location  = Location(event.player.world, event.to?.blockX!!.toDouble(), event.to?.blockY!!.toDouble() + 20.0 ,event.to?.blockZ!!.toDouble());
        if (  loc.block.type != Material.AIR ){
            return ;
        }

        loc.block.type = Material.LAVA

    }

}