package com.vbagde.pipeline

class MavenHelper {
  def steps
  MavenHelper(steps) {
    this.steps = steps
  }
  def setup() {
    steps.echo "Running environment Maven"
  }
  def build(String goal) {
    step.sh """
      mvn "$goal"
    """
  }
}
