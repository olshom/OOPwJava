# Health Centre Performance Measures
## Directly Observable Variables:
- A (Arrival Count): Total number of patients who arrived at the health centre during simulation
- C (Completed Count): Number of patients who completed their entire visit (diagnosis, treatment, discharge)
- B (Busy Time): Total time doctors/nurses spent actively providing medical services to patients
- T (Total Simulation Time): Complete duration of the health centre simulation period
## Derived Variables:
- U (Utilization): U = B/T - Percentage of time medical staff are actively treating patients vs. idle time
- X (Throughput): X = C/T - Rate of patients successfully treated per unit time (patients/hour)
- S (Service Time): S = B/C - Average time spent providing medical care per patient
## Additional Directly Observable Variables:
- R𝑖 (Individual Response Time): Time from when patient enters health centre queue until they leave after treatment completion
- W (Cumulative Waiting Time): Sum of all patients' total response times in the system
## Additional Derived Variables:
- R (Average Response Time): R = W/C - Average time patients spend in health centre from arrival to departure
- N (Average Queue Length): N = W/T - Average number of patients in the health centre system (waiting + being served)
## Health Centre Context:
- High utilization (U) indicates efficient staff usage but may increase patient waiting
- Throughput (X) measures health centre capacity to handle patient volume
- Response time (R) directly impacts patient satisfaction and care quality
- Queue length (N) helps determine optimal staffing levels and appointment scheduling

## Two Different Service Systems
graph TD
A[Patient Arrival] --> B[Triage]
A --> C[Registration]
B --> D[Doctor 1]
B --> E[Doctor 2]
B --> F[Doctor 3]
C --> F
D --> G[Pharmacy]
E --> H[Discharge]
F --> I[X-Ray]
I --> J[Doctor Review]
G --> K[Exit]
H --> K
J --> K

graph TD
A[Customer Entrance] --> B[Entrance Queue]
B --> C[ATM 1]
B --> D[ATM 2]
B --> E[Teller 1]
B --> F[Teller 2]
B --> G[Manager]
C --> H[Exit]
D --> H
E --> H
F --> H
G --> H

## Main Loop Algorithm for Three-Phase Simulation

```java
// Main Simulation Loop Algorithm
public void runSimulation() {
    initializeSimulation();
    
    while (clock < simulationEndTime && !eventList.isEmpty()) {
        // A-PHASE: Advance time to next event
        Event nextEvent = eventList.getNextEvent();
        clock = nextEvent.getTime();
        
        // B-PHASE: Process bound events (scheduled events)
        processBoundEvents(nextEvent);
        
        // C-PHASE: Process conditional events (state changes)
        boolean stateChanged;
        do {
            stateChanged = false;
            stateChanged |= checkArrivals();
            stateChanged |= checkDepartures();
            stateChanged |= checkServiceStarts();
        } while (stateChanged);
        
        updateStatistics();
    }
    
    generateReport();
}
````
## Simulator Classes and Event Coding

### A-Phase Coding:
- Advances simulation clock to next scheduled event time
- Retrieves next event from EventList
- Updates system time globally
- Example: `clock = eventList.getNextEvent().getTime()`

### B-Event Coding:
- Processes scheduled/bound events that occur at specific times
- Events like arrivals, service completions
- Removes processed events from EventList
- Example: Arrival events, Departure events

### C-Event Coding:
- Handles conditional activities and state changes
- Processes events that depend on current system state
- Uses do-while loop to check all possible state changes
- Example: Starting service when customer arrives and server is free
- Continues until no more state changes occur
