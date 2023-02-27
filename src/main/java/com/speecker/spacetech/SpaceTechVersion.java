package com.speecker.spacetech;

@SuppressWarnings("unused")
    public final class SpaceTechVersion {

        //Major number is incremented only on rewrite or cleanup
        public static final int MAJOR = 1;
        //Minor number is incremented every time a new feature or mechanic is added or changed. resets every major version change
        public static final int MINOR = 0;
        // Revision number is incremented whenever a bug is fixed or something got rebalanced. resets every minor version change
        public static final int REVISION = 0;
        //This String is for additional info on the release version if needed (like alpha, beta, rc). Comment out when unused
        public static final String EXTRA = "alpha";
        //This is the String formatted version, used in builds
        public static final String VERSION = "@VERSION@";

        private SpaceTechVersion() {
        }
}
