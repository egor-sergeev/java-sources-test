package hierarchy;

interface I {}
interface J extends I {}
interface K extends J {}
class HierarchyTest implements J {}
