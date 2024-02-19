import ch.qos.logback.core.util.Duration;
public class FunctionUse2038 {
public void funcUse() {
Duration duration = new Duration();
duration.buildByMinutes(null);
}
}