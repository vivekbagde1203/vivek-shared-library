def call(map config = [:]) {
    def mvn = new MavenHelper(steps)
    mvn.setup()
    mvn.build(config.goal ?: clean pakage)
}
