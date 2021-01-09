module appfuncs {
  exports appfuncs.simplefuncs to appstart;

  //requires appsupport and makes it transitive
  requires transitive appsupport;
}
