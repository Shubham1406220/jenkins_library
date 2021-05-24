def call (Map name = [:]) {
  def content = libraryResources "/helloworld.sh"
  writeFile file: "helloworld.sh", text: content
  sh "chmod +x ./helloworld.sh"
  sh "./helloworld.sh ${name.name} ${name.year}"
}
