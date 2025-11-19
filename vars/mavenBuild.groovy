import com.vbagde.pipeline.MavenHelper
def call(Map config = [:]) {
    def mvn = new MavenHelper(steps)
    mvn.setup()
    mvn.build(config.goal ?: "clean package")
}
