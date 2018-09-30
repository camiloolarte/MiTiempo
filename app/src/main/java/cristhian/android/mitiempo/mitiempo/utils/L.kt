package cristhian.android.mitiempo.mitiempo.utils


import cristhian.android.mitiempo.mitiempo.BuildConfig
import com.orhanobut.logger.AndroidLogAdapter
import com.orhanobut.logger.Logger
import com.orhanobut.logger.PrettyFormatStrategy

class L {
    private var NAME = "MI_TIEMPO"
    init{
        val formatStrategy = PrettyFormatStrategy.newBuilder().tag(NAME).build()
                //.showThreadInfo(false)
                //.methodCount(val:1)
                //.methodOffset(val:6)
                //.logStrategy(customLog)
                //.tag(NAME)
                //.build()
        Logger.addLogAdapter(object : AndroidLogAdapter(formatStrategy){
            override fun isLoggable(priority: Int, tag: String?): Boolean {
                return BuildConfig.DEBUG_MODE
            }
        })
    }

    companion object {
        private var instance: L? = null

        fun d(message: String){
            iniciarLog()
            Logger.d(message)
        }

        fun y(message: String){
            iniciarLog()
            Logger.v(message)
        }

        private fun iniciarLog(){
            if(instance == null){
                instance = L()
            }
        }
    }
}