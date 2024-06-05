public final class PNB extends NationalBank {
    @Override
    public float getCurrentInterest() {
        return RBI_REPO_RATE + 0.25F;
    }
}
