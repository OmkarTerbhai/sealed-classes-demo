public final class SBI extends NationalBank {
    @Override
    public float getCurrentInterest() {
        return RBI_REPO_RATE + 0.45F;
    }
}
