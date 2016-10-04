import java.io.File

/**
  * Created by FRESHIELD on 2016/10/3.
  */
object FileMatcher {

  private def filesHere = (new File(".")).listFiles

  def filesEnding(query: String) =
    for (file <- filesHere; if file.getName.endsWith(query))
      yield file

  def filesContaining(query: String) =
    for (file <- filesHere; if file.getName.contains(query))
      yield file

  def filesRegex(query: String) =
    for (file <- filesHere; if file.getName.matches(query))
      yield file

  def filesMatching(query: String,
                    matcher: String => Boolean) = {
    for (file <- filesHere; if matcher(file.getName))
      yield file
  }

  def NfilesEnding(query: String) =
    filesMatching(query, _.endsWith(query))

  def NfilesContaining(query: String) =
    filesMatching(query, _.contains(query))

  def NfilesRegex(query: String) =
    filesMatching(query, _.matches(query))

}
