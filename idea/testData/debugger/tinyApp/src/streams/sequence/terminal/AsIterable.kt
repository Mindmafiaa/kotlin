package streams.sequence.terminal

fun main(args: Array<String>) {
  //Breakpoint!
  sequenceOf(1,2,3).onEach { print(1) }.asIterable()
}