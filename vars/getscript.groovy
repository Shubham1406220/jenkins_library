def call (Map name = [:]) {
  def content = libraryResource "/helloworld.sh"
  writeFile file: "helloworld.sh", text: content
  sh "chmod +x ./helloworld.sh"
  sh "./helloworld.sh ${name.name} ${name.year}"
}
