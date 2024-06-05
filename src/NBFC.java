public sealed class NBFC implements FixedInterestRate
                            permits BajajFinance, MuthootFinance{

    protected final float RBI_REPO_RATE = 6.2F;

    @Override
    public float getCurrentInterest() {
        return RBI_REPO_RATE + 6;
    }
}
