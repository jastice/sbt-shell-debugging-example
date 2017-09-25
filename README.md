# Examples of what you can and can't debug with sbt shell debugging in IDEA

## you can debug

* regular project code when run by the `run` or `runMain` task, if not forked by sbt
* tests run with `test` or `testOnly` tasks, if they aren't forked by sbt
* code in scala files that are part of the build definition (in `project` directory)
* code in external plugins, if source is downloaded
* code in sbt itself, if source is downloaded

## you can't debug

* code in `.sbt` files -- this isn't picked up by the debugger (yet)
