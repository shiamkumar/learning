import 'bootstrap/dist/css/bootstrap.min.css';
import { BrowserRouter as Router, Routes, Route } from 'react-router-dom';
import EmployeeList from './components/EmployeesList';
import NotFound from './components/NotFound';
import AddEmployee from './components/AddEmployee';

function App() {
  return (
    <Router>
      <div>
        <div>
          <Routes>
            <Route exact path="/" component={EmployeeList} />
            <Route path="/add" component={AddEmployee} />
            <Route path="/employees/edit/:id" component={AddEmployee} />
            <Route path="*" component={NotFound} />
          </Routes>
        </div>
      </div>
    </Router>
  );
}

export default App;
