public interface StreetActivity {
    public enum StreetAction {
        WAVING("волнуется"), GURGLING("клокочет"), BOILING("кипит");

        private String StreetActionName;
        StreetAction(String streetActionName) {
            this.StreetActionName = streetActionName;
        }
        public String getStreetActionName() {
            return StreetActionName;
        }
    }
}