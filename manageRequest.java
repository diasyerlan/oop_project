package proj;
/**
 * Interface representing the ability to manage requests.
 */
public interface manageRequest {
    /**
     * Responds to a request.
     */
    public void respondRequest();
    /**
     * Gets the requests.
     *
     * @return Request object representing the requests.
     */
    public Request getRequests();
}
