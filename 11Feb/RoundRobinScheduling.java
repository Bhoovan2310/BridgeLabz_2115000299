class Process {
    int processId, burstTime;
    Process next;

    public Process(int processId, int burstTime) {
        this.processId = processId;
        this.burstTime = burstTime;
        this.next = null;
    }
}

class RoundRobin {
    private Process head, tail;
    private int timeQuantum;

    public RoundRobin(int timeQuantum) {
        this.timeQuantum = timeQuantum;
        this.head = this.tail = null;
    }

    public void addProcess(int processId, int burstTime) {
        Process newProcess = new Process(processId, burstTime);
        if (head == null) {
            head = tail = newProcess;
            tail.next = head;
        } else {
            tail.next = newProcess;
            tail = newProcess;
            tail.next = head;
        }
    }

    public void executeProcesses() {
        if (head == null) return;
        Process current = head;
        int timeElapsed = 0;

        while (head != null) {
            System.out.println("Executing Process ID: " + current.processId);
            int executionTime = Math.min(current.burstTime, timeQuantum);
            timeElapsed += executionTime;
            current.burstTime -= executionTime;

            if (current.burstTime == 0) {
                removeProcess(current.processId);
                if (head == null) break;
            }
            current = current.next;
        }
    }

    public void removeProcess(int processId) {
        if (head == null) return;
        if (head.processId == processId) {
            if (head == tail) {
                head = tail = null;
            } else {
                tail.next = head.next;
                head = head.next;
            }
            return;
        }
        Process temp = head;
        do {
            if (temp.next.processId == processId) {
                temp.next = temp.next.next;
                if (temp.next == head) tail = temp;
                return;
            }
            temp = temp.next;
        } while (temp != head);
    }
}

public class RoundRobinScheduling {
    public static void main(String[] args) {
        RoundRobin scheduler = new RoundRobin(4);
        scheduler.addProcess(1, 10);
        scheduler.addProcess(2, 5);
        scheduler.addProcess(3, 8);

        scheduler.executeProcesses();
    }
}
